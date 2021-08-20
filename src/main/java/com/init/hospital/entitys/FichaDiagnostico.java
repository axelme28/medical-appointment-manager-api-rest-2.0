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
@Table(name = "fichadiagnostico")
public class FichaDiagnostico {
	
	@Id
	@Column(name = "id_fichadiagnostico")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_fichadiagnostico;
	
	@Column(name= "nota")
	private String nota;

	public Long getId_fichadiagnostico() {
		return id_fichadiagnostico;
	}

	public void setId_fichadiagnostico(Long id_fichadiagnostico) {
		this.id_fichadiagnostico = id_fichadiagnostico;
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
