package main;

import java.io.FileReader;

import javax.persistence.EntityManager;
import dto.DtoCarrera;
import dto.DtoEstudiante;
import dto.DtoEstudianteCarrera;
import java.io.IOException;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.List;
import factory.FactoryEntityManager;
import entities.Estudiante;
import entities.Carrera;
import repositories.CarreraRepositoryImpl;
import repositories.EstudianteCarreraRepositoryImpl;
import repositories.EstudianteRepositoryImpl;

public class Main {

	public static void main(String[] args) throws SQLException, IOException {
		EntityManager em = FactoryEntityManager.getInstance();

		// creacion estudiantes
		EstudianteRepositoryImpl eri = new EstudianteRepositoryImpl(em);
		Estudiante dolo = new Estudiante(22667189, "Dolo", "Parral", 34, "fem", "Tandil", 127899);
		Estudiante andrea = new Estudiante(12449844, "Andrea", "del Boca", 54, "fem", "Tandil", 813925);
		Estudiante vicky = new Estudiante(33809236, "Vicky", "Lopez", 34, "fem", "Tandil", 716230);
		Estudiante martina = new Estudiante(38652119, "Martina", "Svedas", 23, "fem", "Tandil", 189378);
		Estudiante juan = new Estudiante(20178542, "Juan", "Perez", 40, "masc", "Necochea", 258973);
		Estudiante pedro = new Estudiante(18562902, "Pedro", "Suarez", 44, "masc", "Azul", 188529);
		Estudiante tomas = new Estudiante(47889122, "Tomas", "Gonzalez", 18, "masc", "Tandil", 775630);
		Estudiante jazmin = new Estudiante(45897667, "Jazmin", "San Martin", 21, "fem", "Mar del Plata", 651209);
		Estudiante gaston = new Estudiante(33653449, "Gaston", "Toledo", 35, "masc", "Bolivar", 663308);
		Estudiante clara = new Estudiante(28664332, "Clara", "Rodriguez", 42, "fem", "Azul", 109356);
		Estudiante leon = new Estudiante(43990118, "Leon", "Peralta", 23, "masc", "Necochea", 223986);
		Estudiante franco = new Estudiante(30519551, "Franco", "Vazquez", 29, "masc", "Mar del Plata", 992837);
		Estudiante marina = new Estudiante(29034588, "Marina", "Moreno", 28, "fem", "Azul", 440962);
		Estudiante andres = new Estudiante(31881642, "Andres", "Montiel", 37, "masc", "Mar del Plata", 692601);
		Estudiante carlos = new Estudiante(45670719, "Carlos", "Paredes", 24, "masc", "Azul", 156099);
		Estudiante amalia = new Estudiante(46772098, "Amalia", "Muñoz", 23, "fem", "Tandil", 649276);
		Estudiante alma = new Estudiante(49765180, "Alma", "Martinez", 19, "fem", "Necochea", 972601);
		Estudiante martin = new Estudiante(24776389, "Martin", "Alonso", 48, "masc", "Bolivar", 864419);
		Estudiante juana = new Estudiante(27654318, "Juana", "Lopez", 44, "fem", "Tandil", 817282);
		Estudiante carla = new Estudiante(24785119, "Carla", "Suarez", 48, "fem", "Necochea", 448922);
		Estudiante romina = new Estudiante(24785555, "Romina", "Pereyra", 35, "fem", "Necochea", 44456777);
		// creacion carreras Carreras
		Carrera tudai = new Carrera("Tudai", 2);
		Carrera abogacia = new Carrera("Abogacia", 5);
		Carrera sistemas = new Carrera("Sistemas", 5);
		Carrera contador = new Carrera("Contador", 4);
		Carrera medicina = new Carrera("Medicina", 9);
		Carrera veterinaria = new Carrera("Veterinaria", 6);

		// insertar carreras
		CarreraRepositoryImpl repoCarrera = new CarreraRepositoryImpl(em);

//		repoCarrera.insertarCarrera(tudai);
//		repoCarrera.insertarCarrera(abogacia);
//		repoCarrera.insertarCarrera(sistemas);
//		repoCarrera.insertarCarrera(contador);
//		repoCarrera.insertarCarrera(medicina);
//		repoCarrera.insertarCarrera(veterinaria);

//		System.out.println("==========Ejercicio 2 a): Dar de alta un estudiante==========");
//		eri.altaEstudiante(romina);
//		eri.altaEstudiante(dolo);
//		eri.altaEstudiante(andrea);
//		eri.altaEstudiante(vicky);
//		eri.altaEstudiante(martina);
//		eri.altaEstudiante(juan);
//		eri.altaEstudiante(pedro);
//		eri.altaEstudiante(tomas);
//		eri.altaEstudiante(jazmin);
//		eri.altaEstudiante(gaston);
//		eri.altaEstudiante(clara);
//		eri.altaEstudiante(leon);
//		eri.altaEstudiante(franco);
//		eri.altaEstudiante(marina);
//		eri.altaEstudiante(andres);
//		eri.altaEstudiante(carlos);
//		eri.altaEstudiante(amalia);
//		eri.altaEstudiante(alma);
//		eri.altaEstudiante(martin);
//		eri.altaEstudiante(juana);
//		eri.altaEstudiante(carla);

		// creacion fechas inscripcion
		Timestamp insc1 = new Timestamp(System.currentTimeMillis());
		Timestamp insc2 = Timestamp.valueOf("2020-05-10 10:10:10.0");
		Timestamp insc3 = Timestamp.valueOf("2021-05-10 10:10:10.0");
		Timestamp insc4 = Timestamp.valueOf("2022-08-10 10:10:10.0");
		Timestamp insc5 = Timestamp.valueOf("2019-09-10 10:10:10.0");
		Timestamp insc6 = Timestamp.valueOf("2018-02-10 10:10:10.0");
		Timestamp insc7 = Timestamp.valueOf("2017-02-10 10:10:10.0");
		Timestamp insc8 = Timestamp.valueOf("2016-02-10 10:10:10.0");
		Timestamp insc9 = Timestamp.valueOf("2012-02-10 10:10:10.0");

		// creacion fecha de egreso
		Timestamp grad1 = Timestamp.valueOf("2022-07-23 10:10:10.0");
		Timestamp grad2 = Timestamp.valueOf("2021-04-23 10:10:10.0");
		Timestamp grad3 = Timestamp.valueOf("2019-08-23 10:10:10.0");
		Timestamp grad4 = Timestamp.valueOf("2020-08-23 10:10:10.0");

//		System.out.println("==========Ejercicio 2 b): Matricular estudiante en una carrera==========");

		EstudianteCarreraRepositoryImpl repoEstCarrera = new EstudianteCarreraRepositoryImpl(em);

//		repoEstCarrera.matricularEstudiante(1, 1, insc1, null);
//		repoEstCarrera.matricularEstudiante(1, 2, insc7, grad1);
//		repoEstCarrera.matricularEstudiante(2, 1, insc2, grad1);
//		repoEstCarrera.matricularEstudiante(3, 1, insc3, null);	
//		repoEstCarrera.matricularEstudiante(3, 4, insc6, grad1);	
//		repoEstCarrera.matricularEstudiante(4, 6, insc8, grad1);
//		repoEstCarrera.matricularEstudiante(4, 1, insc6, grad4);
//		repoEstCarrera.matricularEstudiante(5, 1, insc7, grad3);
//		repoEstCarrera.matricularEstudiante(5, 5, insc4, null);
//		repoEstCarrera.matricularEstudiante(6, 1, insc2, grad1);
//		repoEstCarrera.matricularEstudiante(7, 1, insc7, grad3);
//		repoEstCarrera.matricularEstudiante(7, 3, insc7, grad1);
//		repoEstCarrera.matricularEstudiante(8, 2, insc1, null);
//		repoEstCarrera.matricularEstudiante(9, 2, insc2, null);
//		repoEstCarrera.matricularEstudiante(10, 2, insc8, grad2);		
//		repoEstCarrera.matricularEstudiante(11, 2, insc7, grad1);
//		repoEstCarrera.matricularEstudiante(12, 3, insc5, null);
//		repoEstCarrera.matricularEstudiante(13, 3, insc8, grad2);
//		repoEstCarrera.matricularEstudiante(14, 3, insc7, grad1);
//		repoEstCarrera.matricularEstudiante(15, 4, insc7, grad2);
//		repoEstCarrera.matricularEstudiante(16, 4, insc1, null);
//		repoEstCarrera.matricularEstudiante(17, 5, insc9, grad2);
//		repoEstCarrera.matricularEstudiante(18, 5, insc5, null);
//		repoEstCarrera.matricularEstudiante(19, 6, insc8, grad1);
//		repoEstCarrera.matricularEstudiante(20, 6, insc6, null);
//		

		System.out.println("Ejercicio 2 c): Recuperar todos los estudiantes segun criterio (apellido)");

		List<DtoEstudiante> dtoEstudiante = eri.listaEstudiantesPorApellido();
		System.out.println("\n ---------- Listado Estudiantes por Apellido ----------");
		System.out.println("\nNombre\t    Apellido\t Edad\t  LU\t  Ciudad\n");
		for (DtoEstudiante d : dtoEstudiante) {
			System.out.println(d.getNombre() + "\t    " + d.getApellido() + "\t  " + d.getEdad() + "\t" + d.getLibreta()
					+ "\t  " + d.getCiudad());
		}
		System.out.println("-----------------------------------");

		System.out.println("Ejercicio 2 d): recuperar un estudiante, en base a su número de libreta universitaria ");
		DtoEstudiante estudiantePorLibreta = eri.estudiantePorLibreta(127899);
		System.out.println("\n ---------- Estudiante por Libreta Universitaria ----------");
		System.out.println("\nNombre\t    Apellido\t Edad\t  LU\t  Ciudad\n");
		System.out.println(estudiantePorLibreta.getNombre() + "\t    " + estudiantePorLibreta.getApellido() + "\t  "
				+ estudiantePorLibreta.getEdad() + "\t" + estudiantePorLibreta.getLibreta() + "\t  "
				+ estudiantePorLibreta.getCiudad());

		System.out.println("-----------------------------------");

		System.out.println("Ejercicio 2 e): recuperar todos los estudiantes, en base a su género.");
		List<DtoEstudiante> estudiantesPorGenero = eri.listaEstudiantePorGenero("fem");
		System.out.println("\n ---------- Listado Estudiantes por género ----------");
		System.out.println("\nNombre\t    Apellido\t Edad\t  genero\t  Ciudad\n");
		for (DtoEstudiante d : estudiantesPorGenero) {
			System.out.println(d.getNombre() + "\t    " + d.getApellido() + "\t  " + d.getEdad() + "\t" + d.getGenero()
					+ "\t  " + d.getCiudad());
		}

		System.out.println("-----------------------------------");

		System.out.println(
				"Ejercicio 2 f): recuperar las carreras con estudiantes inscriptos, y ordenar por cantidad de inscriptos.");
		List<DtoCarrera> carrerasConInscriptos = repoEstCarrera.carrerasConInscriptosPorCantInsc();
		System.out.println("\nCarrera con inscriptos ordenados por cantidad inscriptos");
		for (DtoCarrera d : carrerasConInscriptos) {
			System.out.println("\nNombre de la carrera: " + d.getNombre() + "  Duración: " + d.getDuracion() + " años");
		}

		System.out.println("-----------------------------------");

		System.out.println(
				"Ejercicio 2 g): recuperar los estudiantes de una determinada carrera, filtrado por ciudad de residencia");
		List<DtoEstudianteCarrera> dto = repoEstCarrera.estudiantesPorCarreraFiltradoCiudad(1, "tandil");
		System.out.println("\nNombre\t    Apellido\t Ciudad\t   Carrera\n");
		for (DtoEstudianteCarrera d : dto) {
			System.out.println(
					d.getNombre() + "\t    " + d.getApellido() + "\t " + d.getCiudad() + "\t   " + d.getCarrera());
		}

		System.out.println("-----------------------------------");

		System.out.println(
				"Ejercicio 3: Generar un reporte de las carreras, que para cada carrera incluya información de los inscriptos y egresados por año. "
						+ "Se deben ordenar las carreras alfabéticamente, y presentarlos años de manera cronológica.");
		for (Object[] resultado : repoEstCarrera.getInforme()) {
			String nombreCarrera = (String) resultado[0];
			int anio = ((Number) resultado[1]).intValue();
			long inscriptos = ((Number) resultado[2]).longValue();
			long egresados = ((Number) resultado[3]).longValue();
			System.out.println("Carrera: " + nombreCarrera + ", Año: " + anio + ", Inscriptos: " + inscriptos
					+ ", Egresados: " + egresados);

		}
		em.close();

	}
}