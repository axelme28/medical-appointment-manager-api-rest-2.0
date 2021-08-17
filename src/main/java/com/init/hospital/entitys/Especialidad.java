package com.init.hospital.entitys;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "especialidad")
public class Especialidad {
	
	@Id
	@Column(name = "id_especialidad")
	private Long id_especialidad;
	
	@Column(name = "tipo_de_especialidad")
	private String tipo_de_especialidad;
	
	

}
