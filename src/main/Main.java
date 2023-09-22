package main;

import java.io.FileReader;

import javax.persistence.EntityManager;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;

import dto.DtoEstudiante;

import java.io.FileReader;
import java.io.IOException;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import factory.FactoryEntityManager;
import entities.Estudiante;
import entities.EstudianteCarrera;
import entities.Carrera;

import repositories.CarreraRepositoryImpl;
import repositories.EstudianteCarreraRepositoryImpl;
//import repositories.EstudianteCarreraRepositoryImpl;
import repositories.EstudianteRepositoryImpl;
import java.io.FileReader;

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
		Estudiante e = new Estudiante (2222222, "dolo", "parral", 34, "fem", "tandil", 999999);
		Estudiante a = new Estudiante (4444444, "andrea", "del boca", 34, "fem", "tandil", 85);
		Estudiante v = new Estudiante (155555, "Victoria", "Lopez", 30, "fem", "tandil", 20);
		Estudiante m = new Estudiante (144444, "Martina", "Svedas", 34, "fem", "tandil",18);
		//eri.altaEstudiante(e);
		//eri.altaEstudiante(a);
		//eri.altaEstudiante(v);
		//eri.altaEstudiante(m);
		
		
		Carrera c = new Carrera("Tudai", 2);
		
		CarreraRepositoryImpl repoCarrera = new CarreraRepositoryImpl(em);
		//repoCarrera.insertarCarrera(c);
		
		EstudianteCarreraRepositoryImpl repoEstCarrera = new EstudianteCarreraRepositoryImpl(em);
		Timestamp inscrip = new Timestamp(System.currentTimeMillis());
		Timestamp inscrip2 = Timestamp.valueOf("2020-05-10 10:10:10.0");
		Timestamp grad = Timestamp.valueOf("2026-09-23 10:10:10.0");
		
		

		// Crear una instancia de EstudianteCarrera y establecer el id compuesto
		//EstudianteCarrera estudianteCarrera = new EstudianteCarrera(e, c, inscrip, grad, 0);
		//EstudianteCarrera estudianteCarreraA = new EstudianteCarrera(a, c, inscrip2, grad, 3);
		EstudianteCarrera estudianteCarreraV = new EstudianteCarrera(v, c, inscrip2, grad, 3);
		EstudianteCarrera estudianteCarreraM = new EstudianteCarrera(m, c, inscrip2, grad, 3);
		
		//matricular estudiante en carrera
		
		//repoEstCarrera.matricularEstudiante(estudianteCarrera);

		//repoEstCarrera.matricularEstudiante(estudianteCarreraA);

		//repoEstCarrera.matricularEstudiante(estudianteCarreraV);
		
		//repoEstCarrera.matricularEstudiante(estudianteCarreraM);
		
		
	
		List<Estudiante> estudiantesPorApellido = eri.listaEstudiantePorApellido();
		estudiantesPorApellido.forEach( p-> System.out.println(p));
		//List<DtoEstudiante> dtoEstudiante =  eri.listaEstudiantePorApellido();
		//System.out.println("\n ---------- Listado Estudiantes por Apellido ----------");
		//System.out.println("Apellido\t   Nombre\t    Carreras");
		//for(DtoEstudiante d:dtoEstudiante) {
		//	System.out.println(" $" + d.getApellido() +"\t\t     " + d.getNombre() +"\t\t    " +d.getCarreras());
		
		
		//System.out.println(estudianteCarrera.getIdEstudianteCarrera()); 
		em.close();
		
	}

}
