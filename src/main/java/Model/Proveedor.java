package Model;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;
import javax.persistence.Id;

@Entity

@Table(name = "tb_proveedor")
@Data
public class Proveedor {
	
	@Id
	private int idproveedor; 
	private String nombre_rs;  
	private String telefono; 
	private String email; 
	
	
	
	  
	
	
	
	
}
