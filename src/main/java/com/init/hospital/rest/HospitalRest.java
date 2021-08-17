package com.init.hospital.rest;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.init.hospital.dao.PacienteDao;
import com.init.hospital.entitys.Paciente;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/")
public class HospitalRest {
	@Autowired
	private PacienteDao Pacientedao;
	
	//Servicio para loggin 
	@CrossOrigin(origins = "http://localhost:3000")
	@GetMapping("/Loggin/{user}")
	public ResponseEntity<List<Paciente>> loggin (@PathVariable("user") String user){
		List<Paciente> getPaciente = Pacientedao.findByUser(user);
		return ResponseEntity.ok(getPaciente);
		
	}
	
	//Servicio para registro de nuevo usuario
	
	@CrossOrigin(origins = "http://localhost:3000")
	@PostMapping("/registro")
	public ResponseEntity<Paciente> register (@RequestBody Paciente paciente){
		Paciente createPaciente = Pacientedao.save(paciente);
		return ResponseEntity.ok(createPaciente);
		
		
	}
}
