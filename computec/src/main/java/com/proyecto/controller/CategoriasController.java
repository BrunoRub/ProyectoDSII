package com.proyecto.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.proyecto.entity.Categorias;
import com.proyecto.service.CategoriasService;


@RestController
@RequestMapping("/rest/categoria")
public class CategoriasController {

	CategoriasService service;
	
	@GetMapping
	public List<Categorias> listaCategorias(){
		return service.listaCategorias();
	}
}
