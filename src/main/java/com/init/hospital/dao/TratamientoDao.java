package com.init.hospital.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.init.hospital.entitys.Tratamiento;

public interface TratamientoDao extends JpaRepository<Tratamiento, Long> {

}
