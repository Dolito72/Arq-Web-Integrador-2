package repositories;

import java.sql.Timestamp;
import java.util.List;
import javax.persistence.EntityManager;
import dto.DtoEstudianteCarrera;
import dto.DtoCarrera;
import entities.Carrera;
import entities.Estudiante;
import entities.EstudianteCarrera;
import entities.CarreraEstudianteId;

public class EstudianteCarreraRepositoryImpl implements EstudianteCarreraRepository {
	private EntityManager em;

	public EstudianteCarreraRepositoryImpl(EntityManager em) {
		this.em = em;
	}

	@Override
	public void matricularEstudiante(int idEst, int idCarr, Timestamp fechaInsc, Timestamp fechaEgreso) {
		Estudiante e = em.find(Estudiante.class, idEst);
		Carrera c = em.find(Carrera.class, idCarr);
		CarreraEstudianteId claveComp = new CarreraEstudianteId();
		EstudianteCarrera estCarr = new EstudianteCarrera(e, c, fechaInsc, fechaEgreso, claveComp);

		this.em.getTransaction().begin();
		em.persist(estCarr);
		this.em.getTransaction().commit();

	}

	@Override
	public List<DtoCarrera> carrerasConInscriptosPorCantInsc() {
		@SuppressWarnings("unchecked")
		List<DtoCarrera> carrerasConInscriptosPorCantInsc = em.createQuery(
				"SELECT new dto.DtoCarrera(c.nombre , c.duracion) FROM Carrera c JOIN  c.estudiantes e GROUP BY c ORDER BY COUNT(e) DESC",
				DtoCarrera.class).getResultList();
		return carrerasConInscriptosPorCantInsc;
	}

	@Override
	public List<DtoEstudianteCarrera> estudiantesPorCarreraFiltradoCiudad(int idCarrera, String ciudad) {
		@SuppressWarnings("unchecked")
		String jpql = "SELECT new dto.DtoEstudianteCarrera (e.nombre, e.apellido, e.ciudadResidencia, c.nombre) FROM Estudiante e "
				+ "JOIN EstudianteCarrera ec ON ec.estudiante = e.estudianteId "
				+ "JOIN Carrera c ON c.carreraId = ec.carrera " + "WHERE e.ciudadResidencia = ?1 AND c.carreraId = ?2";
		List<DtoEstudianteCarrera> dto = em.createQuery(jpql, DtoEstudianteCarrera.class).setParameter(1, ciudad)
				.setParameter(2, idCarrera).getResultList();

		return dto;
//		return null;
	}

	@Override
	public List<Object[]> getInforme() {
		@SuppressWarnings("unchecked")
		List<Object[]> informe = em.createNativeQuery(
				"SELECT nombreCarrera, anio, SUM(cantidadInscriptos) AS inscriptos,  SUM(cantidadEgresados) AS egresados "
						+ "FROM ("
						+ "(SELECT c.nombre AS nombreCarrera, COUNT(ec.estudiante_id) AS cantidadInscriptos, 0 AS cantidadEgresados,EXTRACT(YEAR FROM ec.fecha_inscripcion) AS anio "
						+ "FROM estudiante_carrera ec JOIN Carrera c on c.carrera_id= ec.carrera_id "
						+ "GROUP BY nombreCarrera, anio ) " + "UNION ALL "
						+ "(SELECT c1.nombre AS nombreCarrera, 0 AS cantidadInscriptos ,COUNT(ec1.estudiante_id) AS cantidadEgresados, EXTRACT(YEAR FROM ec1.fecha_egreso) AS anio "
						+ "FROM estudiante_carrera ec1 JOIN Carrera c1 on c1.carrera_id=ec1.carrera_id "
						+ "GROUP BY nombreCarrera, anio ) )s " + "WHERE anio IS NOT NULL "
						+ "GROUP BY nombreCarrera, anio " + "ORDER BY nombreCarrera ,anio")
				.getResultList();
		return informe;
	}

}
	

