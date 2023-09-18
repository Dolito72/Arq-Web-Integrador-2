package entities;

import java.sql.Date;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;




@Entity
public class Carrera {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id_carrera;
	@Column
	private String nombre;
	
	@OneToMany (mappedBy = "carrera", fetch=FetchType.LAZY)
	private List<EstudianteCarrera> estudiantes;

		public Carrera () {
			this.estudiantes= new ArrayList<EstudianteCarrera>();
			
	}

		public Carrera(int id_carrera, String nombre, List<EstudianteCarrera> estudiantes) {
			super();
			this.id_carrera = id_carrera;
			this.nombre = nombre;
			this.estudiantes = estudiantes;
		}

		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public List<EstudianteCarrera> getEstudiantes() {
			return estudiantes;
		}

		public void setEstudiantes(List<EstudianteCarrera> estudiantes) {
			this.estudiantes = estudiantes;
		}

		public int getId_carrera() {
			return id_carrera;
		}

		@Override
		public String toString() {
			return "Carrera [id_carrera=" + id_carrera + ", nombre=" + nombre + ", estudiantes=" + estudiantes + "]";
		}
	
	
	

}
