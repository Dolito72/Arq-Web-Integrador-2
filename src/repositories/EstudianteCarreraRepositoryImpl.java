package repositories;

import javax.persistence.EntityManager;

public class EstudianteCarreraRepositoryImpl implements EstudianteCarreraRepository {
	private EntityManager em;
	
	public EstudianteCarreraRepositoryImpl(EntityManager em) {
		this.em = em;
	}
	
	

	@Override
	public void altaEstudianteCarrera() {
		
		
	}

}
