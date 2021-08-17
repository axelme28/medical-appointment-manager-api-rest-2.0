package com.init.hospital.entitys;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Direccion")
public class Direccion {
	
	@Id
	@Column(name = "id_direccion")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_direccion;
	
	@Column(name = "calle") 
	private String calle;	
	
	@Column(name = "num_int") 
	private String num_int;	
	
	@Column(name = "num_ext") 
	private String num_ext;	
	
	@Column(name = "colonia") 
	private String colonia;	
	
	@Column(name = "alcaldia")
	
	
	private String alcaldia;

	public String getCalle() {
		return calle;
	}

	public void setCalle(String calle) {
		this.calle = calle;
	}

	public String getNum_int() {
		return num_int;
	}

	public void setNum_int(String num_int) {
		this.num_int = num_int;
	}

	public String getNum_ext() {
		return num_ext;
	}

	public void setNum_ext(String num_ext) {
		this.num_ext = num_ext;
	}

	public String getColonia() {
		return colonia;
	}

	public void setColonia(String colonia) {
		this.colonia = colonia;
	}

	public String getAlcaldia() {
		return alcaldia;
	}

	public void setAlcaldia(String alcaldia) {
		this.alcaldia = alcaldia;
	}

	public Long getId_direccion() {
		return id_direccion;
	}

	public void setId_direccion(Long id_direccion) {
		this.id_direccion = id_direccion;
	}	
	
	
	
	
}
