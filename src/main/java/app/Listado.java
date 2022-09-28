package app;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.*;
import Model.Usuario;

public class Listado {

	// listado de todo los usuarios

	// obtener la conexion --> voy a lallamar a la unidad de persistencia

	public static void main(String[] args) {

		// obtener la conexion

		EntityManagerFactory Fabrica = Persistence.createEntityManagerFactory("jpa_sesion02");
		EntityManager em = Fabrica.createEntityManager();

		// PROCESO--->LISTADO -->NO SE UTILIZA GETtrans..().begin
		// select * from tb_xxxx-----> coleccion list<Entidad> /Arraylist<Entidad>
		// CREATENAMEQUERY->LLAMAR A UNA CONSULTA ASOCIADA A UN NOMBRE
		// CREATENATIVEQUERY -->EJECUTAR UNA CONSULTA DEN SQL NATIVO --->CON BD NO
		// NORMALIZ.
		// CREATEQUERY -->EJECUTAR UNA CONSULTA SQL + JPA (Entidades)-->JPQL

		List<Usuario> lstUsuarios = em.createQuery("Select u from Usuario u ", Usuario.class).getResultList();

		System.out.println("Listado");
		for (Usuario u : lstUsuarios) {
			System.out.println("codigo..:" + u.getCodigo());
			System.out.println("nombre..:" + u.getNombre() + " " + u.getApellidos());
			System.out.println("tipo..:" + u.getTipo() + "_" + u.getObjTipo().getDescripcion());
			System.out.println("--------------------");

		}

		// cerrar

		em.close();

	}

}
