package com.init.hospital.entitys;

import java.sql.Date;
import java.sql.Time;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Mcita")
public class MCita {
	
	@Id
	@Column(name = "id_cita")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_cita;
	
	@Column(name = "fecha_cita")
	private Date fecha_cita;
	
	@Column(name = "hora_cita")
	private Time hora_cita;

	public Long getId_cita() {
		return id_cita;
	}

	public void setId_cita(Long id_cita) {
		this.id_cita = id_cita;
	}

	public Date getFecha_cita() {
		return fecha_cita;
	}

	public void setFecha_cita(Date fecha_cita) {
		this.fecha_cita = fecha_cita;
	}

	public Time getHora_cita() {
		return hora_cita;
	}

	public void setHora_cita(Time hora_cita) {
		this.hora_cita = hora_cita;
	}


	
}
