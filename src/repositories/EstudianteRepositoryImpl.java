package repositories;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import entities.Estudiante;

public class EstudianteRepositoryImpl implements EstudianteRepository {
	private EntityManager em;
		
	public EstudianteRepositoryImpl(EntityManager em) {
		this.em = em;
	}

	@Override
	public void altaEstudiante(Estudiante e) {
		// TODO Auto-generated method stub
	}

	@Override
	public List<Estudiante> listaEstudiantePorApellido() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Estudiante estudiantePorLibreta(int numeroLibreta) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Estudiante> listaEstudiantePorGenero(String genero) {
		// TODO Auto-generated method stub
		return null;
	}

	
	
}
