package Model;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;
import javax.persistence.Id;

@Entity
@Table(name = "tb_categorias")
@Data
public class Categoria {
	
	 
		@Id
		private	int idcategoria	; 
		private String	descripcion ; 
}
