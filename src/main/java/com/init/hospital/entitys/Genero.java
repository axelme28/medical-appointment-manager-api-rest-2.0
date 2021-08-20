package com.init.hospital.entitys;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "genero")
public class Genero {
	
	@Id
	@Column(name = "id_genero")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id_genero;
	
	@Column(name = "genero")
	private boolean genero;
	
	//true = Femenino
	//false = Masculino
	
	
	public long getId_genero() {
		return id_genero;
	}
	public void setId_genero(long id_genero) {
		this.id_genero = id_genero;
	}
	public boolean isGenero() {
		return genero;
	}
	public void setGenero(boolean genero) {
		this.genero = genero;
	}
	
}
