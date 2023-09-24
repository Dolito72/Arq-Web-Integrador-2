package entities;




import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Calendar;
import java.util.Objects;

@Entity
@Table(name ="estudiante_carrera")
public class EstudianteCarrera{
		//borrre new
	@EmbeddedId 
	private CarreraEstudianteId idEstudianteCarrera;
	
	@ManyToOne(targetEntity = Estudiante.class)
	@MapsId("estudianteId")
	@JoinColumn(name = "estudiante_id")
	private Estudiante estudiante;

	@ManyToOne (targetEntity = 	Carrera.class)
	@MapsId("carreraId")
	@JoinColumn(name = "carrera_id")
	private Carrera carrera;
	
	@Column
	private Timestamp fecha_inscripcion;
	
	@Column
	private Timestamp fecha_egreso;
	
	//sacralo de la tabla no de la clase, ya q va cambiando
	@Column  //actual - inscripcion
	private int antiguedad;
	
	//tal vez no es necesario modelarlo en la tabla pero si tenerlo en la clase
	@Column
	private Boolean graduado;

	public EstudianteCarrera() {
		
	}
	//cambie antiguedad y ver si esta graduado a la hora de crearlo
	public EstudianteCarrera(Estudiante e, Carrera c, Timestamp anio_inscripcion, Timestamp anio_egreso, CarreraEstudianteId id) {
		this.idEstudianteCarrera = id;
		this.estudiante = e;
		this.carrera = c;
		this.fecha_inscripcion = anio_inscripcion;
		this.fecha_egreso = anio_egreso;
		this.antiguedad = this.getAntiguedad(anio_inscripcion);
		this.graduado = this.verificarGraduado(anio_egreso);
	}

	public boolean isGraduado() {
		return graduado;
	}
	
	public boolean verificarGraduado(Timestamp anio_egreso) {
		return !(anio_egreso == null);
	}

	public void setGraduado(boolean graduado) {
		this.graduado = graduado;
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

	public Integer getAntiguedad(Timestamp anio_inscripcion) {
		Calendar fechaInscripcion = Calendar.getInstance();
		fechaInscripcion.setTimeInMillis(this.fecha_inscripcion.getTime());
		return Calendar.getInstance().get(Calendar.YEAR) - fechaInscripcion.get(Calendar.YEAR);
	}

	public void setAntiguedad(int antiguedad) {
		this.antiguedad = antiguedad;
	}

	public CarreraEstudianteId getIdEstudianteCarrera() {
		return idEstudianteCarrera;
	}

	@Override
	public String toString() {
		return "EstudianteCarrera [idEstudianteCarrera=" + idEstudianteCarrera + ", fecha_inscripcion=" + fecha_inscripcion + ", fecha_egreso=" + fecha_egreso
				+ ", antiguedad=" + antiguedad + "]";
	}

	public void setIdEstudianteCarrera(CarreraEstudianteId idComp) {
		// TODO Auto-generated method stub
		
	}

	public void setFecha_inscripcion(Timestamp inscrip) {
		// TODO Auto-generated method stub
		
	}

	
}
