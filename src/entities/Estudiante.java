package entities;


import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;



@Entity
public class Estudiante {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private int id;
	@Column
	private String nombres;
	@Column
	private String apellido;
	@Column
	private int edad;
	@Column
	private String genero;
	@Column
	private int dni;
	@Column
	private String ciudadResidencia;
	@Column
	private int numeroLibreta;
	@ManyToMany(fetch = FetchType.LAZY, mappedBy = "inscriptos")
	private ArrayList<Carrera>carreras;
	
	public Estudiante() {
		this.carreras = new ArrayList<Carrera>();
		
	}

	
	
}
