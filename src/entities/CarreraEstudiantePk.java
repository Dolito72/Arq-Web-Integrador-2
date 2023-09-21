package entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;

@Embeddable
public class CarreraEstudiantePk implements Serializable{
	@Column
	
	private int id_estudiante;

	@Column
	
	private int id_carrera;
}
