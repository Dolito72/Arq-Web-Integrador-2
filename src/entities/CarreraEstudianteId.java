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
	@Column
	private int estudiante_id;
	
	@Column
	private int carrera_id;
    
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


	public int getEstudiante_id() {
		return estudiante_id;
	}

	public int getCarrera_id() {
		return carrera_id;
	}

	public void setEstudiante_id(int estudiante_id) {
		this.estudiante_id = estudiante_id;
	}

	public void setCarrera_id(int carrera_id) {
		this.carrera_id = carrera_id;
	}

	   
	public CarreraEstudianteId(int estudiante_id, int carrera_id) {
		super();
		this.estudiante_id = estudiante_id;
		this.carrera_id = carrera_id;
	}

	@Override
	public String toString() {
		return "CarreraEstudianteId [estudiante=" + estudiante_id + ", carrera=" + carrera_id + "]";
	}
	    
	   
}



