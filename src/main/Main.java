package main;

import java.io.FileReader;

import javax.persistence.EntityManager;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;

import java.io.FileReader;
import java.io.IOException;
import java.sql.SQLException;

import factory.FactoryEntityManager;
import entities.Estudiante;
import entities.Carrera;
import entities.EstudianteCarrera;
import repositories.EstudianteRepositoryImpl;
import java.io.FileReader;
import utils.Helper;

public class Main {

	public static void main(String[] args) throws SQLException, IOException  {
		EntityManager em = FactoryEntityManager.getInstance();
		//em.getTransaction().begin();
		//CSVParser datosEstudiantes = CSVFormat.DEFAULT.withHeader().parse(new FileReader("./src/csv/estudiantes.csv"));
		//CSVParser datosCarrera = CSVFormat.DEFAULT.withHeader().parse(new FileReader("./src/csv/carreras.csv"));
		//CSVParser datosEstudianteCarrera = CSVFormat.DEFAULT.withHeader().parse(new FileReader("./src/csv/estudianteCarrera.csv"));
	//	CSVParser datosClientes = CSVFormat.DEFAULT.withHeader().parse(new FileReader("./src/dataset/clientes.csv"));
		
		//Helper helper = new Helper(em);
		//helper.fillTables(datosEstudiantes, datosCarrera,datosEstudianteCarrera);
		//helper.fillTableEstudiante(datosEstudiantes);
		//helper.fillTableCarrera(datosCarrera);
		
		//em.getTransaction().commit();
		//em.close();
		
		EstudianteRepositoryImpl eri = new EstudianteRepositoryImpl(em);
		Estudiante e = new Estudiante (44, "vicky", "lopez", 34, "fem", "tandil", 999999);
		eri.altaEstudiante(e);
		System.out.println(e);
		
	}

}
