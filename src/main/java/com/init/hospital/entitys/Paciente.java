package com.init.hospital.entitys;

import java.sql.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;



@Entity
@Table(name = "paciente")
public class Paciente {
	@Id
	@Column(name = "nss")
	private long nss;
	
	@Column(name = "nombre")
	private String nombre;
	
	@Column(name = "primer_apellido")
	private String primer_apellido;
	
	@Column(name = "segundo_apellido")
	private String segundo_apellido;
	
	@Column(name = "fecha_nacimiento")
	private Date fecha_nacimiento;
	
	@Column(name = "curp")
	private String curp;
	
	@Column(name = "fecha_alta")
	private Date fecha_alta;
	
	@Column(name = "user")
	private String user;
	
	@Column(name = "password")
	private String password;
	
	//---Foreign keys ---
	
	@JsonIgnore
	@ManyToOne(cascade=CascadeType.ALL, targetEntity=Genero.class, fetch = FetchType.LAZY)
	@JoinColumn(name = "id_genero",referencedColumnName = "id_genero")
	private Genero id_genero;
	
	@JsonIgnore
	@ManyToOne(cascade=CascadeType.ALL, targetEntity=TipoSangre.class, fetch = FetchType.LAZY)
	@JoinColumn(name = "id_tipo_sangre",referencedColumnName = "id_tipoSangre")
	private TipoSangre id_tipoSangre;
	
	@JsonIgnore
	@ManyToOne(cascade=CascadeType.ALL, targetEntity=Ocupacion.class, fetch = FetchType.LAZY)
	@JoinColumn(name = "id_ocupacion", referencedColumnName = "id_ocupacion")
	private Ocupacion id_ocupacion;
	
	@JsonIgnore
	@ManyToOne(cascade=CascadeType.ALL, targetEntity=EstadoCivil.class, fetch = FetchType.LAZY)
	@JoinColumn(name = "id_estadoCivil", referencedColumnName = "id_estadoCivil")
	private EstadoCivil id_estadoCivil;
	
	@JsonIgnore
	@ManyToOne(cascade=CascadeType.ALL, targetEntity=Alergia.class, fetch = FetchType.LAZY)
	@JoinColumn(name = "id_alergia", referencedColumnName = "id_alergia")
	private Alergia id_alergia;
	
	@JsonIgnore
	@ManyToOne(cascade=CascadeType.ALL, targetEntity=Direccion.class, fetch = FetchType.LAZY)
	@JoinColumn(name = "id_direccion", referencedColumnName = "id_direccion")
	private Direccion id_direcion;
	
	@JsonIgnore
	@OneToOne(cascade=CascadeType.ALL, targetEntity=EExpedienteClinico.class, fetch = FetchType.LAZY)
	@JoinColumn(name = "mnss_paciente", referencedColumnName = "mnss_paciente")
	private EExpedienteClinico mnss_paciente;
	
	
	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public long getNss() {
		return nss;
	}

	public void setNss(long nss) {
		this.nss = nss;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPrimer_apellido() {
		return primer_apellido;
	}

	public void setPrimer_apellido(String primer_apellido) {
		this.primer_apellido = primer_apellido;
	}

	public String getSegundo_apellido() {
		return segundo_apellido;
	}

	public void setSegundo_apellido(String segundo_apellido) {
		this.segundo_apellido = segundo_apellido;
	}

	public Date getFecha_nacimiento() {
		return fecha_nacimiento;
	}

	public void setFecha_nacimiento(Date fecha_nacimiento) {
		this.fecha_nacimiento = fecha_nacimiento;
	}

	public String getCurp() {
		return curp;
	}

	public void setCurp(String curp) {
		this.curp = curp;
	}

	public Date getFecha_alta() {
		return fecha_alta;
	}

	public void setFecha_alta(Date fecha_alta) {
		this.fecha_alta = fecha_alta;
	}

}
