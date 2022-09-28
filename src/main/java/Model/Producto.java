package Model;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
@Table(name = "tb_productos")
@Data
public class Producto {

	@Id
	private String id_prod;
	 private String des_prod;
	 private int stk_prod;
	 private double pre_prod;
	 private int idcategoria;
	 private boolean est_prod;
	 private int idproveedor;
		 
	 @ManyToOne
	 @JoinColumn(name = "idcategoria" , insertable = false , updatable = false)
	 private Categoria objCategoria;
	 
	 
	 @ManyToOne
	 @JoinColumn(name = "idproveedor" , insertable = false , updatable = false)
	 private Proveedor objproveedor;

}
