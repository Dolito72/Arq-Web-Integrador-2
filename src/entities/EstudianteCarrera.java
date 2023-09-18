package entities;

import javax.annotation.processing.Generated;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name ="estudiante_carrera")
public class EstudianteCarrera {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_ec;
	
	@ManyToOne(cascade = CascadeType.MERGE)
	@JoinColumn(name = "fk_estudiante")
	private Estudiante estudiante;
	
	@ManyToOne(cascade = CascadeType.MERGE)
	@JoinColumn(name = "fk_carrera")
	private Carrera carrera;
	
	@Column
	private int anioInscripcion;
	
	@Column
	private int anioGraduacion;
	
	@Column
	private int antiguedad;

	public EstudianteCarrera() {
		
	}

	public EstudianteCarrera(int id_ec, Estudiante estudiante, Carrera carrera, int anioInscripcion, int anioGraduacion,
			int antiguedad) {
		super();
		this.id_ec = id_ec;
		this.estudiante = estudiante;
		this.carrera = carrera;
		this.anioInscripcion = anioInscripcion;
		this.anioGraduacion = anioGraduacion;
		this.antiguedad = antiguedad;
	}

	public Estudiante getEstudiante() {
		return estudiante;
	}

	public void setEstudiante(Estudiante estudiante) {
		this.estudiante = estudiante;
	}

	public Carrera getCarrera() {
		return carrera;
	}

	public void setCarrera(Carrera carrera) {
		this.carrera = carrera;
	}

	public int getAnioInscripcion() {
		return anioInscripcion;
	}

	public void setAnioInscripcion(int anioInscripcion) {
		this.anioInscripcion = anioInscripcion;
	}

	public int getAnioGraduacion() {
		return anioGraduacion;
	}

	public void setAnioGraduacion(int anioGraduacion) {
		this.anioGraduacion = anioGraduacion;
	}

	public int getAntiguedad() {
		return antiguedad;
	}

	public void setAntiguedad(int antiguedad) {
		this.antiguedad = antiguedad;
	}

	public int getId_ec() {
		return id_ec;
	}

	@Override
	public String toString() {
		return "EstudianteCarrera [id_ec=" + id_ec + ", estudiante=" + estudiante + ", carrera=" + carrera
				+ ", anioInscripcion=" + anioInscripcion + ", anioGraduacion=" + anioGraduacion + ", antiguedad="
				+ antiguedad + "]";
	}
}
