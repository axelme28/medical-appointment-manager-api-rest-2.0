package com.init.hospital.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.init.hospital.entitys.Direccion;

public interface DireccionDao extends JpaRepository<Direccion, Long>{
	
}

