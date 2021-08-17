package com.init.hospital.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.init.hospital.entitys.TipoSangre;

public interface TipoSangreDao extends JpaRepository<TipoSangre, Long>{
	
}

