package utils;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import entities.Carrera;
import entities.Estudiante;
import entities.EstudianteCarrera;
import factory.FactoryEntityManager;
import repositories.CarreraRepositoryImpl;
import repositories.EstudianteRepository;
import repositories.EstudianteRepositoryImpl;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import org.hibernate.hql.internal.classic.ClauseParser;



public class Helper {
	private EntityManager em;
	
	
	public Helper(EntityManager em) {
		this.em =em;
	}
	
	//aca se insertan los csv
	
	public void fillTables(CSVParser datosEstudiantes, CSVParser datosCarrera, CSVParser datosEstudianteCarrera) throws SQLException {
		em.getTransaction().begin();
		this.fillTableEstudiante(datosEstudiantes);
		this.fillTableCarrera(datosCarrera);
		this.fillTableEstudianteCarrera(datosEstudianteCarrera);
	//	this.fillTableFacturaProducto(datosFactProd);
		em.getTransaction().commit();
		em.close();
	}
	
		
	
		public void fillTableEstudiante(CSVParser datosCarrera) throws SQLException {
			for (CSVRecord row : datosCarrera) {
				int dni = Integer.parseInt(row.get("dni"));
				String nombre = row.get("nombre");
				String apellido = row.get("apellido");
				int edad = Integer.parseInt(row.get("edad"));
				String genero = row.get("genero");
				String ciudad = row.get("ciudad");
				int LU = Integer.parseInt(row.get("LU"));
				
				Estudiante e = new Estudiante(dni,nombre, apellido,edad, genero, ciudad, LU);
				
				em.persist(e);
			
			}
		}
		

		public void fillTableCarrera(CSVParser datosCarrera) throws SQLException {
			for (CSVRecord row : datosCarrera) {
				int id_carrera = Integer.parseInt(row.get("id_carrera"));
				String nombre = row.get("carrera");
				int duracion = Integer.parseInt(row.get("duracion"));
			
				Carrera c = new Carrera(id_carrera, nombre, duracion);
	
				em.persist(c);
				
			}
		}
		
		public void fillTableEstudianteCarrera(CSVParser datosEstudianteCarrera) throws SQLException {
			for (CSVRecord row : datosEstudianteCarrera) {
				int dni_est = Integer.parseInt(row.get("id_estudiante"));
				int id_carrera = Integer.parseInt(row.get("id_carrera"));
				int inscripcion = Integer.parseInt(row.get("inscripcion"));
				int graduacion = Integer.parseInt(row.get("graduacion"));
				int antiguedad = Integer.parseInt(row.get("antiguedad"));
				
				EstudianteRepositoryImpl eri = new EstudianteRepositoryImpl(em);
				CarreraRepositoryImpl cri = new CarreraRepositoryImpl(em);
				
				Estudiante e = eri.estudiantePorDni(dni_est);
				
				Carrera c = cri.carreraPorId(id_carrera);
			
				EstudianteCarrera estCarrera = new EstudianteCarrera(e, c, inscripcion, graduacion, antiguedad);;
	
				em.persist(estCarrera);
				
			}
		}

}

