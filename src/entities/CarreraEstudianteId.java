package entities;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Entity;
import org.hibernate.engine.internal.Cascade;

@Embeddable
public class CarreraEstudianteId implements Serializable{
	 @ManyToOne (targetEntity = Estudiante.class, cascade  = CascadeType.ALL) 
	 @JoinColumn(name = "id_estudiante", nullable = false)
	 private Estudiante estudiante;

	   @ManyToOne  (targetEntity = Carrera.class,cascade = CascadeType.ALL)
	   @JoinColumn(name = "id_carrera", nullable = false)
	   private Carrera carrera;
	    
	   public CarreraEstudianteId() {
	   }
	   
	   
	   

	   @Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}




	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
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




	public CarreraEstudianteId(Estudiante estudiante,Carrera carrera) {
	    	this.estudiante=estudiante;
	        this.carrera=carrera;
	    }
	   
	@Override
	public String toString() {
		return "CarreraEstudianteId [estudiante=" + estudiante + ", carrera=" + carrera + "]";
	}
	    
	   
}



