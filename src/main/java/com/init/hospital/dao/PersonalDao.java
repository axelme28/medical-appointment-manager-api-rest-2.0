package com.init.hospital.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.init.hospital.entitys.Personal;

public interface PersonalDao extends JpaRepository<Personal, Long> {

}
