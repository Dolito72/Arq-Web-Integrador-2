package main;

import java.io.FileReader;

import javax.persistence.EntityManager;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;

import java.io.FileReader;
import java.io.IOException;
import java.sql.SQLException;
import java.sql.Timestamp;

import factory.FactoryEntityManager;
import entities.Estudiante;
import entities.EstudianteCarrera;
import entities.Carrera;

import repositories.CarreraRepositoryImpl;
import repositories.EstudianteCarreraRepositoryImpl;
//import repositories.EstudianteCarreraRepositoryImpl;
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
		Estudiante e = new Estudiante (44, "dolo", "parral", 34, "fem", "tandil", 999999);
		eri.altaEstudiante(e);
		
		Carrera c = new Carrera("Tudai", 2);
		
		CarreraRepositoryImpl repoCarrera = new CarreraRepositoryImpl(em);
		repoCarrera.insertarCarrera(c);
		
		EstudianteCarreraRepositoryImpl repoEstCarrera = new EstudianteCarreraRepositoryImpl(em);
		Timestamp inscrip = new Timestamp(System.currentTimeMillis());
		Timestamp grad = Timestamp.valueOf("2026-09-23 10:10:10.0");
		
		
		// Crear una instancia de EstudianteCarreraId
		//CarreraEstudianteId idComp = new CarreraEstudianteId(e, c);
		//idComp.setEstudiante(e);
		//idComp.setCarrera(c);

		// Crear una instancia de EstudianteCarrera y establecer el id compuesto
		EstudianteCarrera estudianteCarrera = new EstudianteCarrera(e, c, inscrip, grad, 0);
		//estudianteCarrera.setIdEstudianteCarrera(idComp);
		//estudianteCarrera.setAnio_egreso(grad);
		//estudianteCarrera.setFecha_inscripcion(inscrip);
		
		
		repoEstCarrera.matricularEstudiante(estudianteCarrera);
		
		//System.out.println(estudianteCarrera.getIdEstudianteCarrera()); 
		em.close();
		
	}

}
