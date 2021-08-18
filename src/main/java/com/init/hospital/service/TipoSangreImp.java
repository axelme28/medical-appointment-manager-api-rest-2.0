package com.init.hospital.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.init.hospital.dao.TipoSangreDao;
import com.init.hospital.entitys.TipoSangre;

@Service
public class TipoSangreImp implements TipoSangreService{
	@Autowired
	private TipoSangreDao repository;
	
	@Override
	public List<TipoSangre> listasangre() {
		// TODO Auto-generated method stub
		return repository.findAll();
		
	}
	

}
