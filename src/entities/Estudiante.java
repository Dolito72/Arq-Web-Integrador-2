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
	private int dni;
	@Column
	private String nombre;
	@Column
	private String apellido;
	@Column
	private int edad;
	@Column
	private String genero;
	
	@Column (name="ciudad")
	private String ciudadResidencia;
	@Column
	private int LU;
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "estudiante")
	private List<EstudianteCarrera>carreras;
	
	public Estudiante(int dni, String nombre, String apellido, int edad, String genero, String ciudad, int Lu) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.genero = genero;
		this.dni = dni;
		this.ciudadResidencia = ciudad;
		this.LU = Lu;
		this.carreras = new ArrayList<EstudianteCarrera>();
	}

	public Estudiante() {
		this.carreras = new ArrayList<EstudianteCarrera>();
	}

	public String getNombres() {
		return nombre;
	}

	public void setNombres(String nombres) {
		this.nombre = nombres;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public int getDni() {
		return dni;
	}

	

	public String getCiudadResidencia() {
		return ciudadResidencia;
	}

	public void setCiudadResidencia(String ciudadResidencia) {
		this.ciudadResidencia = ciudadResidencia;
	}

	public int getNumeroLibreta() {
		return LU;
	}

	public void setNumeroLibreta(int numeroLibreta) {
		this.LU = numeroLibreta;
	}

	public List<EstudianteCarrera> getCarreras() {
		return carreras;
	}

	public void setCarreras(List<EstudianteCarrera> carreras) {
		this.carreras = carreras;
	}


	@Override
	public String toString() {
		return "Estudiante [nombres=" + nombre + ", apellido=" + apellido
				+ ", edad=" + edad + ", genero=" + genero + ", dni=" + dni + ", ciudadResidencia=" + ciudadResidencia
				+ ", numeroLibreta=" + LU + ", carreras=" + carreras + "]";
	}

	
	
}
