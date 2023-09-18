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
	public void matricularEstudiante(Estudiante e) {
		// TODO Auto-generated method stub
		
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

}
