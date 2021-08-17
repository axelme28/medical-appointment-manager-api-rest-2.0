package com.init.hospital.entitys;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tratamiento")
public class Tratamiento {
	
	@Id
	@Column(name = "id_tratamiento")
	private Long id_tratamiento;
	
	@Column(name = "tratamiento")
	private String tratamiento;

	public Long getId_tratamiento() {
		return id_tratamiento;
	}

	public void setId_tratamiento(Long id_tratamiento) {
		this.id_tratamiento = id_tratamiento;
	}

	public String getTratamiento() {
		return tratamiento;
	}

	public void setTratamiento(String tratamiento) {
		this.tratamiento = tratamiento;
	}
	
	

}
