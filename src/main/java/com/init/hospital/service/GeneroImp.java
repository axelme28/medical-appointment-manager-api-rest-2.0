package com.init.hospital.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.init.hospital.dao.GeneroDao;
import com.init.hospital.entitys.Genero;

@Service
public class GeneroImp implements GeneroService{
	
	@Autowired
	private GeneroDao repository;

	@Override
	public List<Genero> listgenero() {
		// TODO Auto-generated method stub
		return repository.findAll();
		
	}
	
}
