package app;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import Model.Producto;


public class ListadoProducto {

	

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

			List<Producto> lstProductos = em.createQuery("Select p from Producto p ", Producto.class).getResultList();

			System.out.println("Listado");
			for (Producto p : lstProductos) {
				System.out.println("codigo..:" + p.getId_prod());
				System.out.println("nombre..:" + p.getDes_prod());
				System.out.println("stock..:" + p.getStk_prod());
				System.out.println("precio..:" + p.getPre_prod());
				System.out.println("categoria..:" + p.getIdcategoria() + '-' + p.getObjCategoria().getDescripcion());
				System.out.println("proveedor..:" + p.getIdproveedor() + '-' + p.getObjproveedor().getNombre_rs());
						    
				System.out.println("--------------------");

			}

			// cerrar

			em.close();

		

}
}