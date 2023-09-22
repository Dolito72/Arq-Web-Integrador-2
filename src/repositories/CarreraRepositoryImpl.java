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
	public void insertarCarrera(Carrera c) {
		this.em.getTransaction().begin();
		if(!em.contains(c)) {
			em.persist(c);
		}
		else {
			System.out.println("ya existe");
		}
		this.em.getTransaction().commit();
		//em.close();
	
	}



}
