package com.init.hospital.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.init.hospital.entitys.Especialidad;

public interface EspecialidadDao extends JpaRepository<Especialidad, Long> {

}
