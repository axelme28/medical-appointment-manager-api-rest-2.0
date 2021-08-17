package com.init.hospital.entitys;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "expedienteClinico")
public class ExpedienteClinico {
	
	@Id
	@Column(name = "id_expedienteclinico")
	private Long id_expedienteclinico;
	
	@Column(name = "pregunta_1")
	private String pregunta_1;
	
	@Column(name = "pregunta_2")
	private String pregunta_2;
	
	@Column(name = "pregunta_3")
	private String pregunta_3;

	public Long getId_expedienteclinico() {
		return id_expedienteclinico;
	}

	public void setId_expedienteclinico(Long id_expedienteclinico) {
		this.id_expedienteclinico = id_expedienteclinico;
	}

	public String getPregunta_1() {
		return pregunta_1;
	}

	public void setPregunta_1(String pregunta_1) {
		this.pregunta_1 = pregunta_1;
	}

	public String getPregunta_2() {
		return pregunta_2;
	}

	public void setPregunta_2(String pregunta_2) {
		this.pregunta_2 = pregunta_2;
	}

	public String getPregunta_3() {
		return pregunta_3;
	}

	public void setPregunta_3(String pregunta_3) {
		this.pregunta_3 = pregunta_3;
	}
	
	
}
