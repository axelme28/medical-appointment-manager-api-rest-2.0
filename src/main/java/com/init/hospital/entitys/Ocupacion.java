package com.init.hospital.entitys;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ocupacion")
public class Ocupacion {
	
	@Id
	@Column(name = "id_ocupacion")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_ocupacion;
	
	@Column(name = "ocupacion")
	private String Ocupacion;

	public Long getId_ocupacion() {
		return id_ocupacion;
	}

	public void setId_ocupacion(Long id_ocupacion) {
		this.id_ocupacion = id_ocupacion;
	}

	public String getOcupacion() {
		return Ocupacion;
	}

	public void setOcupacion(String ocupacion) {
		Ocupacion = ocupacion;
	}
	
}
