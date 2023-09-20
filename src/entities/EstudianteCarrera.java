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
	private int id;
	
	@ManyToOne(cascade = CascadeType.MERGE)
	@JoinColumn(name = "fk_estudiante")
	private Estudiante estudiante;
	
	@ManyToOne(cascade = CascadeType.MERGE)
	@JoinColumn(name = "fk_carrera")
	private Carrera carrera;
	
	@Column
	private int inscripcion;
	
	@Column
	private int graduacion;
	
	@Column
	private int antiguedad;

	public EstudianteCarrera() {
		
	}

	public EstudianteCarrera(int id_ec, Estudiante estudiante, Carrera carrera, int anioInscripcion, int anioGraduacion,
			int antiguedad) {
		super();
		this.id = id_ec;
		this.estudiante = estudiante;
		this.carrera = carrera;
		this.inscripcion = anioInscripcion;
		this.graduacion = anioGraduacion;
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
		return inscripcion;
	}

	public void setAnioInscripcion(int anioInscripcion) {
		this.inscripcion = anioInscripcion;
	}

	public int getAnioGraduacion() {
		return graduacion;
	}

	public void setAnioGraduacion(int anioGraduacion) {
		this.graduacion = anioGraduacion;
	}

	public int getAntiguedad() {
		return antiguedad;
	}

	public void setAntiguedad(int antiguedad) {
		this.antiguedad = antiguedad;
	}

	public int getId_ec() {
		return id;
	}

	@Override
	public String toString() {
		return "EstudianteCarrera [id_ec=" + id+ ", estudiante=" + estudiante + ", carrera=" + carrera
				+ ", anioInscripcion=" + inscripcion + ", anioGraduacion=" + graduacion + ", antiguedad="
				+ antiguedad + "]";
	}
}
