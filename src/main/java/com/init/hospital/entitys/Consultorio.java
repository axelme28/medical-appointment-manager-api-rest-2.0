package com.init.hospital.entitys;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "consultorio")
public class Consultorio {
	
	@Id
	@Column(name = "id_consultorio")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_consultorio;
	
	@Column(name = "num_consultorio")
	private String num_consultorio;

	public Long getId_consultorio() {
		return id_consultorio;
	}

	public void setId_consultorio(Long id_consultorio) {
		this.id_consultorio = id_consultorio;
	}

	public String getNum_consultorio() {
		return num_consultorio;
	}

	public void setNum_consultorio(String num_consultorio) {
		this.num_consultorio = num_consultorio;
	}
	
	
	//---Foreign keys ---
	
	@ManyToOne(cascade=CascadeType.ALL, targetEntity=TipoConsultorio.class)
	@JoinColumn(name = "id_tipoconsultorio",referencedColumnName = "id_tipoconsultorio")
	private TipoConsultorio id_tipoconsultorio;


}
