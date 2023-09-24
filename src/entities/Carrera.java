package entities;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Carrera {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "carrera_id")
	private int carreraId;
	@Column
	private String nombre;

	@Column
	private int duracion;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "carrera")
	private Set<EstudianteCarrera> estudiantes;

	public Carrera() {
		// this.estudiantes = null;

	}

	public Carrera(String nombre, int duracion) {
		this.nombre = nombre;
		this.duracion = duracion;
		this.estudiantes = new HashSet<EstudianteCarrera>();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Set<EstudianteCarrera> getEstudiantes() {
		return estudiantes;
	}

	public void setEstudiantes(Set<EstudianteCarrera> estudiantes) {
		this.estudiantes = estudiantes;
	}

	public int getId_carrera() {
		return carreraId;
	}

	@Override
	public String toString() {
		return "Carrera [id_carrera=" + carreraId + ", nombre=" + nombre + "]";
	}

}
