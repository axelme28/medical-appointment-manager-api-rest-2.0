package com.init.hospital.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.init.hospital.entitys.Ocupacion;

public interface OcupacionDao extends JpaRepository<Ocupacion, Long>{
	
}
