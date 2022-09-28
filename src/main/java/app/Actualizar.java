package app;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import Model.Usuario;

public class Actualizar {
	
	public static void main(String[] args) {
		
		//metodo para actualizar 
		//obtener la conexion  --> voy a lallamar a la unidad de persistencia
		
				EntityManagerFactory Fabrica = Persistence.createEntityManagerFactory("jpa_seccion01");
				
				//generar el manejador de entidades segun la connecxion
				
				EntityManager em = Fabrica.createEntityManager();
				
				// proceso de actualizar de un nuevo usuario ---> transaccion(reg,act,eli)
				
				em.getTransaction().begin();
				
				//objeto usuario
				
				Usuario u = new Usuario();  
				u.setCodigo(23);
				u.setNombre("jimmy Darwin");
				u.setApellidos("carrasco");
				u.setUsuario("jimi108@hotmail.com");
				u.setClave("12345586");
				u.setFchnac("2021/05/05");
				u.setTipo(1);
				u.setEstado(1);
				
				em.merge(u);
				
				//cerrar la transaccion
				
				em.getTransaction().commit();
				
				//cerra
				
				em.close();
				
	}

}
