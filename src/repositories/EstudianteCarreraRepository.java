package repositories;


import java.util.List;

import entities.Carrera;
import entities.EstudianteCarrera;

public interface EstudianteCarreraRepository {
	//recuperar las carreras con estudiantes inscriptos, y ordenar por cantidad de inscriptos.
	
	void matricularEstudiante(EstudianteCarrera ec);
	List<Carrera> carrerasConInscriptosPorCantInsc();
		
}
