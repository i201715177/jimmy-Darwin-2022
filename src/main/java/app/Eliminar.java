package app;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import Model.Usuario;

public class Eliminar {

	public static void main(String[] args) {

		
		// obtener la conexion --> voy a lallamar a la unidad de persistencia

		EntityManagerFactory Fabrica = Persistence.createEntityManagerFactory("jpa_seccion01");

		// generar el manejador de entidades segun la connecxion

		EntityManager em = Fabrica.createEntityManager();

		// proceso de eliminar de un nuevo usuario ---> transaccion(reg,act,eli)

		em.getTransaction().begin();

		// objeto usuario

		Usuario u = new Usuario();
		u.setCodigo(20);

		//FORMA NUMERO 1 borrado fisico .....elimar difinitivamente

		//em.remove(u); //necesito toda la informacion del usuraio ..< buscxar y devolver un obj de usuario
		
		//FORMA NUMERO 1
		
	   u.setEstado(2);  //necesario toda la informacion del ususario
	   em.merge(u);
		
		
		
		// confirmacion la transaccion

		em.getTransaction().commit();

		// cerra

		em.close();

	}

}
