package com.init.hospital.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.init.hospital.entitys.FichaDiagnostico;

public interface FichaDiagnosticoDao extends JpaRepository<FichaDiagnostico, Long> {

}
