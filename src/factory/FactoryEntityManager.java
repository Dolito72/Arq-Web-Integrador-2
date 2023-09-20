package factory;

import javax.persistence.Persistence;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

public class FactoryEntityManager {
	private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("Integrador-2");
	private static EntityManager em;
	
	private FactoryEntityManager () {
		
	}

	public static EntityManager getInstance() {
		if ((em == null) || (!em.isOpen())){
			//EntityManagerFactory emf = Persistence.createEntityManagerFactory("Integrador2");
			em = emf.createEntityManager();
		}
		return em;
	}
}
