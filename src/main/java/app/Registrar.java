package app;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import Model.Usuario;

public class Registrar {
	
	public static void main(String[] args) {
		
		//obtener la conexion  --> voy a lallamar a la unidad de persistencia
		
		EntityManagerFactory Fabrica = Persistence.createEntityManagerFactory("jpa_sesion02");
		
		//generar el manejador de entidades segun la connecxion
		
		EntityManager em = Fabrica.createEntityManager();
		
		// proceso de registro de un nuevo usuario ---> transaccion(reg,act,eli)
		
		em.getTransaction().begin();
		
		//objeto usuario
		
		//Usuario u =new Usuario(20,"jimmy", "arrasco carrasco" ,"jPerez","55555", "2000/10/05", 1, 1);
		Usuario u =new Usuario();
		u.setCodigo(23);
		u.setNombre("jimmy Darwin");
		u.setApellidos("carrasco");
		u.setUsuario("jimi108@hotmail.com");
		u.setClave("12345586");
		u.setFchnac("2021/05/05");
		u.setTipo(1);
		u.setEstado(1);
		em.persist(u);
		
		//cerrar la transaccion
		
		em.getTransaction().commit();
		
		//cerra
		
		em.close();
		
		
	}
}
