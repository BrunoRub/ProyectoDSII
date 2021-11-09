package com.proyecto.serviceImp;

import org.springframework.beans.factory.annotation.Autowired;

import com.proyecto.entity.Pedidos;
import com.proyecto.repository.PedidosRepository;
import com.proyecto.service.PedidosService;

public class PedidosServiceImp implements PedidosService{

	
	@Autowired
	private  PedidosRepository repository;

	@Override
	public Pedidos registraPedidos(Pedidos obj) {
		
		return repository.save(obj);
	}
	
	
	
	

}
