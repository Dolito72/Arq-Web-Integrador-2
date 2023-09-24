package repositories;

import java.util.List;

import dto.DtoEstudiante;
import entities.Estudiante;

public interface EstudianteRepository {
	
	
	void altaEstudiante(Estudiante e);
	DtoEstudiante estudiantePorLibreta(int numeroLibreta);
	List<DtoEstudiante> listaEstudiantePorGenero(String genero);
	List<DtoEstudiante> listaEstudiantesPorApellido();
	
	
	
	
	
	
}
