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
@Table(name = "horarioMedico")
public class HorarioMedico {
	
	@Id
	@Column(name = "id_horariomedico")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_horariomedico;
	
	@Column(name = "hora_entrada")
	private String hora_entrada;
	
	@Column(name = "hora_salida")
	private String hora_salida;
	
	//---Foreign keys ---
	
	@ManyToOne(cascade=CascadeType.ALL, targetEntity=HorarioDia.class)
	@JoinColumn(name = "id_horariodia",referencedColumnName = "id_horariodia")
	private HorarioDia id_horariodia;
	
	

}
