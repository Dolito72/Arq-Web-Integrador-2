package repositories;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import dto.DtoEstudianteCarrera;
import entities.Carrera;
import entities.Estudiante;
import entities.EstudianteCarrera;

public class EstudianteCarreraRepositoryImpl implements EstudianteCarreraRepository {
	private EntityManager em;
	
	public EstudianteCarreraRepositoryImpl(EntityManager em) {
		this.em = em;
	}

	@Override
	public void matricularEstudiante(EstudianteCarrera ec) {
		this.em.getTransaction().begin();
		em.persist(ec);
		this.em.getTransaction().commit();
		//em.close();
	}
	

	@Override
	public List<Carrera> carrerasConInscriptosPorCantInsc() {
		//this.em.getTransaction().begin();
		@SuppressWarnings("unchecked")
		List<Carrera> carrerasConInscriptosPorCantInsc = em.createQuery("SELECT c FROM Carrera c JOIN FETCH c.estudiantes e GROUP BY c ORDER BY COUNT(e) DESC").getResultList(); 
		//em.close();
		return carrerasConInscriptosPorCantInsc;
			}
//
	@Override
	public List<EstudianteCarrera> estudiantesPorCarreraFiltradoCiudad(Carrera carrera, String ciudad) {
		
		@SuppressWarnings("unchecked")
		
		List<EstudianteCarrera> dto = em.createQuery("SELECT ec FROM EstudianteCarrera ec JOIN Estudiante e JOIN Carrera c WHERE c.nombre = ?1 AND e.ciudad = ?2")
		.setParameter(1, carrera.getNombre()).setParameter(2, ciudad)
		.getResultList(); 
		//em.close();
		return dto;
//		return null;
	}

	//List<DtoEstudianteCarrera> dto = em.createQuery("SELECT new DtoEstudianteCarrera (ec.nombre, ec.apellido, ec.ciudad, ec.carrera) FROM Estudiante_carrera ec JOIN Estudiante e JOIN Carrera c WHERE c.nombre = ?1 AND e.ciudad = ?2", DtoEstudianteCarrera.class)
	//		.setParameter(1, carrera.getNombre()).setParameter(2, ciudad)
	//		.getResultList(); 

}

	
	

