package com.init.hospital.rest;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.init.hospital.dao.PacienteDao;
import com.init.hospital.entitys.Paciente;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/")
public class HospitalRest {
	@Autowired
	private PacienteDao hospitaldao;
	
	//Servive for consult user and password
	@GetMapping
	@CrossOrigin(origins = "http://localhost:3000")
	public ResponseEntity<Paciente> getPasswordAndUsername (@PathVariable("id") Long id){
		Optional<Paciente> getPaciente = hospitaldao.findById(id);
		return ResponseEntity.ok(getPaciente.get());
	}
	
}
