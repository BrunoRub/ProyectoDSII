package com.proyecto.serviceImp;

import java.util.List;

import org.springframework.stereotype.Service;

import com.proyecto.entity.Categorias;
import com.proyecto.repository.CategoriasRepository;
import com.proyecto.service.CategoriasService;

@Service
public class CategoriasServiceImp implements CategoriasService {


	CategoriasRepository repository;
	
	@Override
	public List<Categorias> listaCategorias() {

		return repository.findAll();
	}

	
}
