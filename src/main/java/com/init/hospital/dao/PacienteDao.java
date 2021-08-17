package com.init.hospital.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.init.hospital.entitys.Paciente;


public interface PacienteDao extends JpaRepository<Paciente, Long>{
	
}
