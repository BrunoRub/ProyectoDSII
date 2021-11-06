package com.proyecto.serviceImp;

import java.util.List;

import org.springframework.stereotype.Service;

import com.proyecto.entity.Proveedores;
import com.proyecto.repository.ProveedoresRepository;
import com.proyecto.service.ProveedoresService;

@Service
public class ProveedoresServiceImp implements ProveedoresService {

	ProveedoresRepository repository;
	
	@Override
	public List<Proveedores> listaProveedor() {
		
		return repository.findAll();
	}

	@Override
	public Proveedores registraProveedor(Proveedores pr) {
	
		return repository.save(pr);
	}


	
}
