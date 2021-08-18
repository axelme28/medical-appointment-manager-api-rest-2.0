package com.init.hospital.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.init.hospital.dao.OcupacionDao;
import com.init.hospital.entitys.Ocupacion;

@Service
public class OcupacionImp implements OcupacionService{
	
	@Autowired
	private OcupacionDao repository;

	@Override
	public List<Ocupacion> listocupacion() {
		// TODO Auto-generated method stub
		return repository.findAll();
		
	}
	
}
