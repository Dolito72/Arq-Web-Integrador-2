package entities;




import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Calendar;
import java.util.Objects;


@Entity
@Table(name ="estudiante_carrera")
public class EstudianteCarrera implements Serializable{
	@EmbeddedId
	private CarreraEstudiantePk idEstudianteCarrera;
	
	@ManyToOne(cascade = CascadeType.MERGE)
	@JoinColumn(name = "fk_estudiante")
	private Estudiante estudiante;
	
	@ManyToOne(cascade = CascadeType.MERGE)
	@JoinColumn(name = "fk_carrera")
	private Carrera carrera;
	
	@Column
	private Timestamp fecha_inscripcion;
	
	@Column
	private Timestamp fecha_egreso;
	
	@Column  //actual - inscripcion
	private int antiguedad;

	public EstudianteCarrera() {
		
	}

	public EstudianteCarrera(Timestamp anio_inscripcion, Timestamp anio_egreso, int antiguedad) {
		
		this.fecha_inscripcion = anio_inscripcion;
		this.fecha_egreso = anio_egreso;
		this.antiguedad = antiguedad;
	}
/*
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

	public CarreraEstudiantePk getCarreraEstudiantePk() {
		return idEstudianteCarrera;
	}*/

	public Timestamp getAnio_inscripcion() {
		return this.fecha_inscripcion;
	}

	public Timestamp getAnio_egreso() {
		return this.fecha_egreso;
	}

	public void setAnio_inscripcion(Timestamp anio_inscripcion) {
		this.fecha_inscripcion = anio_inscripcion;
	}

	public void setAnio_egreso(Timestamp anio_egreso) {
		this.fecha_egreso = anio_egreso;
	}

	public Integer getAntiguedad() {
		Calendar fechaInscripcion = Calendar.getInstance();
		fechaInscripcion.setTimeInMillis(this.fecha_inscripcion.getTime());
		return Calendar.getInstance().get(Calendar.YEAR) - fechaInscripcion.get(Calendar.YEAR);
	}

	public void setAntiguedad(int antiguedad) {
		this.antiguedad = antiguedad;
	}

	

	@Override
	public String toString() {
		return "EstudianteCarrera [año inscripcion=" + fecha_inscripcion + ", año egreso=" + fecha_egreso + ", antiguedad="
				+ antiguedad + "]";
	}
}
