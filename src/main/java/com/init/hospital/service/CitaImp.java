package com.init.hospital.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.init.hospital.dao.DCitaDao;
import com.init.hospital.entitys.DCita;

@Service
public class CitaImp implements CitaService {

	@Autowired
	private DCitaDao repository;
	
	
	@Override
	public DCita crearcita(DCita cita) {
		// TODO Auto-generated method stub
		return repository.save(cita);
		
	}

	@Override
	public Optional<DCita> consultarcita(Long id_Dcita) {
		// TODO Auto-generated method stub
		return repository.findById(id_Dcita);
		
	}
	

}
