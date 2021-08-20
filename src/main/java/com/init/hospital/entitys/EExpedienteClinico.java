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
@Table(name = "EexpedienteClinico")
public class EExpedienteClinico {
	
	@Id
	@Column(name = "mnss_paciente")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long mnss_paciente;

	public Long getMnss_paciente() {
		return mnss_paciente;
	}

	public void setMnss_paciente(Long mnss_paciente) {
		this.mnss_paciente = mnss_paciente;
	}
	
	//---Foreign keys ---
	
	@ManyToOne(cascade=CascadeType.ALL, targetEntity=ExpedienteClinico.class)
	@JoinColumn(name = "id_expedienteclinico",referencedColumnName = "id_expedienteclinico")
	private ExpedienteClinico id_expedienteclinico;
	
	@ManyToOne(cascade=CascadeType.ALL, targetEntity=FichaDiagnostico.class)
	@JoinColumn(name = "id_fichadiagnostico",referencedColumnName = "id_fichadiagnostico")
	private FichaDiagnostico id_fichadiagnostico;
	
	@ManyToOne(cascade=CascadeType.ALL, targetEntity=DCita.class)
	@JoinColumn(name = "id_dcita",referencedColumnName = "id_dcita")
	private DCita id_dcita;

}
