package dto;

public class DtoEstudianteCarrera {

	private String nombre;
	private String apellido;
	private String ciudad;
	private String carrera;

	public DtoEstudianteCarrera(String nombre, String apellido, String ciudad, String carrera) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.ciudad = ciudad;
		this.carrera = carrera;
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public String getCiudad() {
		return ciudad;
	}

	public String getCarrera() {
		return carrera;
	}

	@Override
	public String toString() {
		return "DtoEstudianteCarrera [nombre=" + nombre + ", apellido=" + apellido + ", ciudad=" + ciudad + ", carrera="
				+ carrera + "]";
	}
}
