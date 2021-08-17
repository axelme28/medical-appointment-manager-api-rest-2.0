package com.init.hospital.entitys;



import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "personal")
public class Personal {
	
	@Id
	@Column(name = "id_personal")
	private Long id_personal;
	
	@Column(name = "nombre_personal")
	private String nombre_personal;
	
	@Column(name = "primer_apellido")
	private String primer_apellido;
	
	@Column(name = "segundo_apellido")
	private String segundo_apellido;
	
	@Column(name = "user")
	private String user;
	
	@Column(name = "password")
	private String password;

	public Long getId_personal() {
		return id_personal;
	}

	public void setId_personal(Long id_personal) {
		this.id_personal = id_personal;
	}

	public String getNombre_personal() {
		return nombre_personal;
	}

	public void setNombre_personal(String nombre_personal) {
		this.nombre_personal = nombre_personal;
	}

	public String getPrimer_apellido() {
		return primer_apellido;
	}

	public void setPrimer_apellido(String primer_apellido) {
		this.primer_apellido = primer_apellido;
	}

	public String getSegundo_apellido() {
		return segundo_apellido;
	}

	public void setSegundo_apellido(String segundo_apellido) {
		this.segundo_apellido = segundo_apellido;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	//---Foreign keys ---

	@ManyToOne(cascade=CascadeType.ALL, targetEntity=Rol.class)
	@JoinColumn(name = "id_rol",referencedColumnName = "id_rol")
	private Rol id_rol;
	
	

}
