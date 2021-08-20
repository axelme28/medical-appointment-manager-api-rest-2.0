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
import com.init.hospital.entitys.DCita;
import com.init.hospital.entitys.Paciente;
import com.init.hospital.service.CitaService;
import com.init.hospital.service.PacienteService;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/")
public class HospitalRest {
	@Autowired
	private PacienteService pacienteservice;
	private PacienteDao Pacientedao;
	@Autowired
	private CitaService citaservice;
	
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
		Paciente createPaciente = pacienteservice.registrarpaciente(paciente);
		return ResponseEntity.ok(createPaciente);
			
	}
	//Servicio para crear cita
	@CrossOrigin(origins = "http://localhost:3000")
	@PostMapping("/crearcita")
	public ResponseEntity<DCita> crearcita(@RequestBody DCita cita){
		DCita nuevacita = citaservice.crearcita(cita);
		return ResponseEntity.ok(nuevacita);
		
	}
	
	//Servicio para consultar cita
	@CrossOrigin(origins = "http://localhost:3000")
	@GetMapping("/consultarcita")
	public ResponseEntity<Optional<DCita>> consultarcita(@RequestBody Long id){
		Optional<DCita> buscarcita = citaservice.consultarcita(id);
			return ResponseEntity.ok(buscarcita);
	}
	
}
