package com.init.hospital.entitys;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "solicitudEspecialidad")
public class SolicitudEspecialidad {
	
	@Id
	@Column(name = "id_solicitudespecialidad")
	private Long id_solicitudespecialidad;
	
	@Column(name = "id_solicitud")
	private int id_solicitud;
	
	@Column(name = "fecha_emision")
	private String fecha_emision;
	
	@Column(name = "nota")
	private String nota;

	public Long getId_solicitudespecialidad() {
		return id_solicitudespecialidad;
	}

	public void setId_solicitudespecialidad(Long id_solicitudespecialidad) {
		this.id_solicitudespecialidad = id_solicitudespecialidad;
	}

	public int getId_solicitud() {
		return id_solicitud;
	}

	public void setId_solicitud(int id_solicitud) {
		this.id_solicitud = id_solicitud;
	}

	public String getFecha_emision() {
		return fecha_emision;
	}

	public void setFecha_emision(String fecha_emision) {
		this.fecha_emision = fecha_emision;
	}

	public String getNota() {
		return nota;
	}

	public void setNota(String nota) {
		this.nota = nota;
	}
	
	
	//---Foreign keys ---
	
	@ManyToOne(cascade=CascadeType.ALL, targetEntity=Tratamiento.class)
	@JoinColumn(name = "id_tratamiento",referencedColumnName = "id_tratamiento")
	private Tratamiento id_tratamiento;

}
