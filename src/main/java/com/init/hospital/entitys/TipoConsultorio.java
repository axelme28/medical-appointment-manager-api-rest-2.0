package com.init.hospital.entitys;

import javax.persistence.Entity;
import javax.persistence.Column;
import javax.persistence.Table;
import javax.persistence.Id;
	
@Entity
@Table(name = "tipoConsultorio")
public class TipoConsultorio {
	
	@Id
	@Column(name = "id_tipoconsultorio")
	private Long id_tipoconsultorio;

	public Long getId_tipoconsultorio() {
		return id_tipoconsultorio;
	}

	public void setId_tipoconsultorio(Long id_tipoconsultorio) {
		this.id_tipoconsultorio = id_tipoconsultorio;
	}
	
	
	
	
}

