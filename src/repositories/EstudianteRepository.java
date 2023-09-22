package repositories;

import java.util.List;

import dto.DtoEstudiante;
import entities.Estudiante;

public interface EstudianteRepository {
	
	
	void altaEstudiante(Estudiante e);
	List<Estudiante> listaEstudiantePorApellido();
	Estudiante estudiantePorLibreta(int numeroLibreta);
	List<Estudiante> listaEstudiantePorGenero(String genero);
	
	
	
	
	
	
	
}
