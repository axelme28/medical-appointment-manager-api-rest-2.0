package com.init.hospital.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.init.hospital.entitys.Consultorio;

public interface ConsultorioDao extends JpaRepository<Consultorio, Long> {

}
