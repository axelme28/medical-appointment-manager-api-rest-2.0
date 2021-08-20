package com.init.hospital.entitys;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "estado_civil")
public class EstadoCivil {
	@Id
	@Column(name = "id_estadoCivil")
	private Long id_estadoCivil;
	
	@Column(name = "estado_civil")
	private String estado_civil;
	

}
