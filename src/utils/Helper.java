package utils;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import entities.Estudiante;
import entities.EstudianteCarrera;
import factory.FactoryEntityManager;
import repositories.EstudianteRepository;

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
	
	public void fillTables(CSVParser datosEstudiantes) throws SQLException {
		em.getTransaction().begin();
		this.fillTableEstudiante(datosEstudiantes);
	//	this.fillTableFactura(datosFacturas);
	//	this.fillTableProducto(datosProd);
	//	this.fillTableFacturaProducto(datosFactProd);
		em.close();
	}
	
	
	
	public void fillTableEstudiante(CSVParser datosEstudiantes) throws SQLException {
		//this.em.getTransaction().begin();
		for (CSVRecord row : datosEstudiantes) {
			int dni = Integer.parseInt(row.get("dni"));
			String nombre = row.get("nombre");
			String apellido = row.get("apellido");
			int edad = Integer.parseInt(row.get("edad"));
			String genero = row.get("genero");
			String ciudad = row.get("ciudad");
			int LU = Integer.parseInt(row.get("LU"));
			Estudiante e = new Estudiante(nombre, apellido,dni,edad, genero, ciudad, LU);

			//if(!em.contains(e)) {
				em.persist(e);
			//} else {
	//			em.merge(e);
	//		}
			//this.em.getTransaction().commit();
		//	em.close();
		
		}
	}

}

