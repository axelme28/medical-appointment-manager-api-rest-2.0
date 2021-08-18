package com.init.hospital.service;

import java.util.Optional;

import com.init.hospital.entitys.DCita;

public interface CitaService {
	public DCita crearcita(DCita cita);
	
	public Optional<DCita> consultarcita(Long id_Dcita);

}
