package com.init.hospital.entitys;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "horario_dia")
public class HorarioDia {
	
	@Id
	@Column(name = "id_horariodia")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_horariodia;
	
	@Column(name = "dia")
	private Date dia;

	public Date getDia() {
		return dia;
	}

	public void setDia(Date dia) {
		this.dia = dia;
	}

	public Long getId_horariodia() {
		return id_horariodia;
	}

	public void setId_horariodia(Long id_horariodia) {
		this.id_horariodia = id_horariodia;
	}


	

}
