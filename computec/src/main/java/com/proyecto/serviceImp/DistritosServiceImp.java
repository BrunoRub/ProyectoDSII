package com.proyecto.serviceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyecto.entity.Distritos;
import com.proyecto.repository.DistritosRepository;
import com.proyecto.service.DistritosService;

@Service
public class DistritosServiceImp implements DistritosService{

	@Autowired
	DistritosRepository repository;

	@Override
	public List<Distritos> listarDistritos() {		
		return repository.findAll();
	}
}
