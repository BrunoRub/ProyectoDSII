package com.proyecto.serviceImp;

import java.util.List;

import org.springframework.stereotype.Service;

import com.proyecto.entity.Productos;
import com.proyecto.repository.ProductosRepository;
import com.proyecto.service.ProductosService;

@Service
public class ProductosServiceImp implements ProductosService {

	ProductosRepository repository;
	
	@Override
	public List<Productos> listaProductos() {
		
		return repository.findAll();
	}

	@Override
	public Productos registraProducto(Productos p) {
		
		return repository.save(p);
	}

}
