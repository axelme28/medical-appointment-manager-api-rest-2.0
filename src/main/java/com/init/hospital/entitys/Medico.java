package com.init.hospital.entitys;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "medico")
public class Medico {
	
	@Id
	@Column(name = "id_medico")
	private Long id_medico;
	
	@Column(name = "Medico")
	private String Medico;

	public Long getId_medico() {
		return id_medico;
	}

	public void setId_medico(Long id_medico) {
		this.id_medico = id_medico;
	}

	public String getMedico() {
		return Medico;
	}

	public void setMedico(String medico) {
		Medico = medico;
	}
	
	//---Foreign keys ---

	@ManyToOne(cascade=CascadeType.ALL, targetEntity=Personal.class)
	@JoinColumn(name = "id_personal",referencedColumnName = "id_personal")
	private Personal id_personal;
	
	@ManyToOne(cascade=CascadeType.ALL, targetEntity=Especialidad.class)
	@JoinColumn(name = "id_especialidad",referencedColumnName = "id_especialidad")
	private Especialidad id_especialidad;
	
	@ManyToOne(cascade=CascadeType.ALL, targetEntity=HorarioMedico.class)
	@JoinColumn(name = "id_horariomedico",referencedColumnName = "id_horariomedico")
	private HorarioMedico id_horariomedico;
}
