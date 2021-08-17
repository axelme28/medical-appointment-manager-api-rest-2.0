package com.init.hospital.entitys;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "alergia")
public class Alergia {
	
	@Id
	@Column(name = "id_alergia")
	private Long id_alergia;
	
	@Column(name = "tipo_alergia")
	private String tipo_alergia;

	public Long getId_alergia() {
		return id_alergia;
	}

	public void setId_alergia(Long id_alergia) {
		this.id_alergia = id_alergia;
	}

	public String getTipo_alergia() {
		return tipo_alergia;
	}

	public void setTipo_alergia(String tipo_alergia) {
		this.tipo_alergia = tipo_alergia;
	}

}
