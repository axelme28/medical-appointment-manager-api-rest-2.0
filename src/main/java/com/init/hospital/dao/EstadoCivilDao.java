package com.init.hospital.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.init.hospital.entitys.EstadoCivil;

public interface EstadoCivilDao extends JpaRepository<EstadoCivil, Long>{
	
}
