package com.init.hospital.entitys;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tipoSangre")
public class TipoSangre {
	
	@Id
	@Column(name = "id_tiposangre")
	private Long id_tipoSangre;
	
	@Column(name = "tipo_sangre")
	private String tipoSangre;

	public Long getId_tipoSangre() {
		return id_tipoSangre;
	}

	public void setId_tipoSangre(Long id_tipoSangre) {
		this.id_tipoSangre = id_tipoSangre;
	}

	public String getTipoSangre() {
		return tipoSangre;
	}

	public void setTipoSangre(String tipoSangre) {
		this.tipoSangre = tipoSangre;
	}
	

}
