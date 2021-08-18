package com.init.hospital.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.init.hospital.dao.PacienteDao;
import com.init.hospital.entitys.Paciente;

@Service
public class PacienteImp implements PacienteService {
	
	@Autowired
	private PacienteDao repository;

	@Override
	public Paciente registrarpaciente(Paciente paciente) {
		// TODO Auto-generated method stub
		return repository.save(paciente);
	}

	

}
