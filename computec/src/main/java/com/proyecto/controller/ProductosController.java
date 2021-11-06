package com.proyecto.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.proyecto.entity.Productos;
import com.proyecto.service.ProductosService;

@RestController
@RequestMapping("/rest/productos")
public class ProductosController {

	ProductosService service;
	
	@GetMapping
	public List<Productos> listaProductos(){
		return service.listaProductos();
	}
	
	
}
