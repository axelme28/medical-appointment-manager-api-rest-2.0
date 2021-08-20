package com.init.hospital.entitys;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "Dcita")
public class DCita {
	
	@Id
	@Column(name = "id_dcita")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_Dcita;

	public Long getId_Dcita() {
		return id_Dcita;
	}

	public void setId_Dcita(Long id_Dcita) {
		this.id_Dcita = id_Dcita;
	}
	
	//---Foreign keys ---
	@JsonIgnore
	@ManyToOne(cascade=CascadeType.ALL, targetEntity=Consultorio.class, fetch = FetchType.LAZY)
	@JoinColumn(name = "id_consultorio",referencedColumnName = "id_consultorio")
	private Consultorio id_consultorio;
	
	@JsonIgnore
	@ManyToOne(cascade=CascadeType.ALL, targetEntity=MCita.class, fetch = FetchType.LAZY)
	@JoinColumn(name = "id_cita",referencedColumnName = "id_cita")
	private MCita id_cita;
	
	@JsonIgnore
	@ManyToOne(cascade=CascadeType.ALL, targetEntity=Medico.class, fetch = FetchType.LAZY)
	@JoinColumn(name = "id_medico",referencedColumnName = "id_medico")
	private Medico id_medico;
	
	

}
