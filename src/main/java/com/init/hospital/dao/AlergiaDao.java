package com.init.hospital.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.init.hospital.entitys.Alergia;

public interface AlergiaDao extends JpaRepository<Alergia, Long>{
	
}
