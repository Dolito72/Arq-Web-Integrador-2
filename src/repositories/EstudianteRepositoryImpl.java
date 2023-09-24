package repositories;

import java.util.List;

import javax.persistence.EntityManager;

import dto.DtoEstudiante;
import entities.Estudiante;

public class EstudianteRepositoryImpl implements EstudianteRepository {
	private EntityManager em;

	public EstudianteRepositoryImpl() {

	}

	public EstudianteRepositoryImpl(EntityManager em) {
		this.em = em;
	}

	@Override
	public void altaEstudiante(Estudiante e) {
		this.em.getTransaction().begin();
		if (!em.contains(e)) {
			em.persist(e);
		} else {
			em.merge(e);
		}
		this.em.getTransaction().commit();

	}

	@Override
	public List<DtoEstudiante> listaEstudiantesPorApellido() {
		@SuppressWarnings("unchecked")
		List<DtoEstudiante> estudiantesPorApellido = em.createQuery(
				"SELECT new dto.DtoEstudiante(e.apellido, e.nombre, e.edad,e.ciudadResidencia,e.genero, e.LU) FROM Estudiante e ORDER BY apellido ASC",
				DtoEstudiante.class).getResultList();
		// em.close();
		return estudiantesPorApellido;
	}

	@Override
	public DtoEstudiante estudiantePorLibreta(int numeroLibreta) {
		@SuppressWarnings("unchecked")
		DtoEstudiante estudiante = em.createQuery(
				"SELECT new dto.DtoEstudiante (e.apellido, e.nombre, e.edad, e.ciudadResidencia,e.genero, e.LU)  FROM Estudiante e WHERE e.LU = ?1",
				DtoEstudiante.class).setParameter(1, numeroLibreta).getSingleResult();
		return estudiante;
	}

	public List<DtoEstudiante> listaEstudiantePorGenero(String genero) {
		@SuppressWarnings("unchecked")
		List<DtoEstudiante> resultados = em.createQuery(
				"SELECT new dto.DtoEstudiante (e.apellido, e.nombre, e.edad, e.ciudadResidencia,e.genero, e.LU) FROM Estudiante e WHERE e.genero = ?1",
				DtoEstudiante.class).setParameter(1, genero).getResultList();
		return resultados;

	}

	
}
