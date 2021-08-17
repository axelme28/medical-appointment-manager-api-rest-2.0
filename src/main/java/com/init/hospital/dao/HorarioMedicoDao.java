package com.init.hospital.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.init.hospital.entitys.HorarioMedico;

public interface HorarioMedicoDao extends JpaRepository<HorarioMedico, Long> {

}
