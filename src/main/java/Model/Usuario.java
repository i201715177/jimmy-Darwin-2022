package Model;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
@Table(name = "tb_usuarios")
@Data
public class Usuario {

	@Id
	@Column(name = "cod_usua")
	private int codigo;

	@Column(name = "nom_usua", length = 15)
	private String nombre;

	@Column(name = "ape_usua", length = 25)
	private String apellidos;

	@Column(name = "usr_usua", unique = true, length = 45)
	private String usuario;

	@Column(name = "cla_usua")
	private String clave;

	@Column(name = "fna_usua")
	private String fchnac;

	@Column(name = "idtipo")
	private int tipo;

	@Column(name = "est_usua")
	private int estado;

	

	public Usuario(int codigo, String nombre, String apellidos, String usuario, String clave, String fchnac, int tipo,
			int estado) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.usuario = usuario;
		this.clave = clave;
		this.fchnac = fchnac;
		this.tipo = tipo;
		this.estado = estado;
	}



	public Usuario() {
		// TODO Auto-generated constructor stub
	}

@ManyToOne
@JoinColumn(name = "idTipo", insertable = false , updatable = false)
private Tipo objTipo;


}

