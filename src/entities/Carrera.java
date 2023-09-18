package entities;

import java.sql.Date;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;




@Entity
public class Carrera {
	@Id
	private int id;
	@Column
	private String nombre;
	@Column
	private Date fechaInscripcion;
	@Column
	private boolean graduado;
	@ManyToMany (fetch=FetchType.LAZY)
	private List<Estudiante> inscriptos;

		public Carrera () {
			this.inscriptos = new ArrayList<Estudiante>();
			
	}
	
	
	

}
