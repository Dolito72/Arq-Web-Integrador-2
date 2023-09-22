package repositories;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import dto.DtoEstudiante;
import entities.Estudiante;

public class EstudianteRepositoryImpl implements EstudianteRepository {
	private EntityManager em;
	
	
	public EstudianteRepositoryImpl() {
		
	}
		
	public EstudianteRepositoryImpl(EntityManager em) {
		this.em = em;
	}

	@Override
	public void altaEstudiante(Estudiante e) {
		//ver chequeos de si ya existe
		this.em.getTransaction().begin();
		//if(!em.contains(e)) {
			em.persist(e);
		//} else {
			//em.merge(e);
		//}
		this.em.getTransaction().commit();
	//	em.close();
	
	}

	@Override
	public List<Estudiante> listaEstudiantePorApellido() {
		//this.em.getTransaction().begin();
		@SuppressWarnings("unchecked")
		List<Estudiante> estudiantesPorApellido = em.createQuery("SELECT e FROM Estudiante e ORDER BY apellido ASC").getResultList(); 
		//em.close();
		return estudiantesPorApellido;
	}

	@Override
	public Estudiante estudiantePorLibreta(int numeroLibreta) {
		//this.em.getTransaction().begin();
		@SuppressWarnings("unchecked")
		
		String jpql = "SELECT e FROM Estudiante e WHERE e.LU = ?1";
		Query query = em.createQuery(jpql);
		query.setParameter(1, numeroLibreta);
		
		//CHEQUEAR XQ ME TRAIGO UNA LISTA Y SOLO NECESITO UNO
		//List<Estudiante> resultados = query.getResultList();
		Estudiante estudiantePorLibreta = (Estudiante) query.getSingleResult(); 
		//Estudiante estudiantePorLibreta = resultados.get(0);
		//em.close();
		return estudiantePorLibreta;
	}

	@Override
	public List<Estudiante> listaEstudiantePorGenero(String genero) {
		this.em.getTransaction().begin();
		@SuppressWarnings("unchecked")
		
		String jpql = "SELECT e FROM Estudiante e WHERE e.genero = ?1";
		Query query = em.createQuery(jpql);
		query.setParameter(1, genero);
		
		//CHEQUEAR XQ ME TRAIGO UNA LISTA Y SOLO NECESITO UNO
		List<Estudiante> resultados = query.getResultList();
		
		
		
		//em.close();
		return resultados;
		
	}
//poner en interface
	public Estudiante estudiantePorDni(int dni) {
		//this.em.getTransaction().begin();
		
		Estudiante e = em.find(Estudiante.class, dni);
		//this.em.getTransaction().commit();
		//em.close();
		return e;
	}
	

}
