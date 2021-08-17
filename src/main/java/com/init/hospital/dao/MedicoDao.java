package com.init.hospital.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.init.hospital.entitys.Medico;

public interface MedicoDao extends JpaRepository<Medico, Long> {

}
