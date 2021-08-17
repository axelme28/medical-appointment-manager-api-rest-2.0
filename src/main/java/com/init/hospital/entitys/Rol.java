package com.init.hospital.entitys;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "rol")
public class Rol {
	
	@Id
	@Column(name = "id_rol")
	private Long id_rol;
	
	@Column(name = "tipo_personal")
	private String tipo_personal;

}
