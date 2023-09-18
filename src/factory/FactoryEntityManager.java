package factory;

import javax.persistence.Persistence;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

public class FactoryEntityManager {
	private static EntityManager em;
	
	private FactoryEntityManager () {
		
	}

	public EntityManager getInstance() {
		if (em == null) {
			EntityManagerFactory emf = Persistence.createEntityManagerFactory("Integrador2");
			em = emf.createEntityManager();
		}
		return em;
	}

	
	  public void closeConnection(EntityManager em) {
	        em.close();
	       // this.emf.close();
	    }    
}
