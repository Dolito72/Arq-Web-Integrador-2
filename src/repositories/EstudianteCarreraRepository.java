package repositories;

import java.sql.Timestamp;
import java.util.List;

import dto.DtoCarrera;
import dto.DtoEstudianteCarrera;


public interface EstudianteCarreraRepository {

	void matricularEstudiante(int idEst, int idCarr, Timestamp fechaInsc, Timestamp fechaEgreso);
	List<DtoCarrera> carrerasConInscriptosPorCantInsc();
	List<DtoEstudianteCarrera> estudiantesPorCarreraFiltradoCiudad(int idCarrera, String ciudad);
	List<Object[]> getInforme();

}
