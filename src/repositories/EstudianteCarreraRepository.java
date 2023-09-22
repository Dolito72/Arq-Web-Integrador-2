package repositories;


import java.util.List;

import dto.DtoEstudianteCarrera;
import entities.Carrera;
import entities.Estudiante;
import entities.EstudianteCarrera;

public interface EstudianteCarreraRepository {
	
	List<EstudianteCarrera> estudiantesPorCarreraFiltradoCiudad(Carrera carrera, String ciudad);
	void matricularEstudiante(EstudianteCarrera ec);
	List<Carrera> carrerasConInscriptosPorCantInsc();
	
		
}
