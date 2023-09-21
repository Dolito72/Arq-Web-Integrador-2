package repositories;

import java.util.List;

import javax.persistence.EntityManager;

import entities.Carrera;
import entities.Estudiante;

public class CarreraRepositoryImpl implements CarreraRepository{
	private EntityManager em;
	
	public CarreraRepositoryImpl(EntityManager em) {
		this.em = em;
	}


	@Override
	public List<Carrera> cantidadInscriptosCarrera() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Estudiante> estudiantesPorCarrera(Carrera carrera, String ciudad) {
		// TODO Auto-generated method stub
		return null;
	}
	//hacer en interfaz
	public Carrera carreraPorId(int id) {
		//this.em.getTransaction().begin();
		
		Carrera c = em.find(Carrera.class, id);
		//this.em.getTransaction().commit();
		//em.close();
		return c;
	}


	@Override
	public void insertarCarrera(Carrera c) {
		this.em.getTransaction().begin();
		em.persist(c);
		this.em.getTransaction().commit();
		//em.close();
	
	}


	@Override
	public void matricularEstudiante(Estudiante e) {
		// TODO Auto-generated method stub
		
	}

}
