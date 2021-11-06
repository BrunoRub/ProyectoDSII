package com.proyecto.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.proyecto.entity.Proveedores;
import com.proyecto.service.ProveedoresService;

@RestController
@RequestMapping("/rest/proveedores")
public class ProveedoresController {

	ProveedoresService service;
	
	@GetMapping
	public List<Proveedores> listaProveedores(){
		
		return service.listaProveedor();
	}
}
