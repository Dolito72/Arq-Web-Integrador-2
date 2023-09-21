package repositories;

import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.EntityManager;

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
		em.close();
		
	}
	
	
}
