package dto;

import java.util.List;

import entities.Carrera;
import entities.EstudianteCarrera;

public class DtoEstudiante {
	private String apellido;
	private String nombre;
	
	private List<EstudianteCarrera> carreras;
	
	public DtoEstudiante(String apellido, String nombre, List<EstudianteCarrera> carreras) {
		super();
		this.apellido = apellido;
		this.nombre = nombre;
		this.carreras = carreras;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public List<EstudianteCarrera> getCarreras() {
		return carreras;
	}
	public void setCarreras(List<EstudianteCarrera> carreras) {
		this.carreras = carreras;
	}
	@Override
	public String toString() {
		return "DtoEstudiante [apellido=" + apellido + ", nombre=" + nombre + ", carreras=" + carreras + "]";
	}
	

	
	
}
