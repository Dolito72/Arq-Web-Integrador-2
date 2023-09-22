package entities;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Entity;
import org.hibernate.engine.internal.Cascade;

@Embeddable
public class CarreraEstudianteId implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Column (name = "estudiante_id")
	private Integer estudianteId;
	
	@Column (name = "carrera_id")
	private Integer carreraId;
    
   public CarreraEstudianteId() {
   }
   
   @Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		CarreraEstudianteId carrEstId = (CarreraEstudianteId) obj;
		return this.getEstudiante_id() == carrEstId.getEstudiante_id() 
				&& this.getCarrera_id() == carrEstId.getCarrera_id();
   }

   @Override
   public int hashCode() {
       int result = estudianteId.hashCode();
       result = 31 * result + carreraId.hashCode();
       return result;
   }

	public int getEstudiante_id() {
		return estudianteId;
	}

	public int getCarrera_id() {
		return carreraId;
	}

	public void setEstudiante_id(int estudiante_id) {
		this.estudianteId = estudiante_id;
	}

	public void setCarrera_id(int carrera_id) {
		this.carreraId = carrera_id;
	}

	   
	public CarreraEstudianteId(int estudiante_id, int carrera_id) {
		super();
		this.estudianteId = estudiante_id;
		this.carreraId = carrera_id;
	}

	@Override
	public String toString() {
		return "CarreraEstudianteId [estudiante=" + estudianteId + ", carrera=" + carreraId + "]";
	}
	    
	   
}



