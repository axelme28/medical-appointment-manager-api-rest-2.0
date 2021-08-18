package com.init.hospital.dao;

import java.io.Serializable;
import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;


import com.init.hospital.entitys.Paciente;



public interface PacienteDao extends JpaRepository<Paciente, Long>, Serializable{
	public List<Paciente> findByUser(String User); 
	
	
	
}
