package repositories;

import java.util.List;

import dto.DtoCantidadInscriptosPorCarrera;
import entities.Carrera;
import entities.Estudiante;

public interface CarreraRepository {
	void matricularEstudiante(Estudiante e);
	List<Carrera>  cantidadInscriptosCarrera();
	List<Estudiante> estudiantesPorCarrera(Carrera carrera, String ciudad);

}
