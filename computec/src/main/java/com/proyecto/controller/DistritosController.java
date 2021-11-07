package com.proyecto.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.proyecto.entity.Distritos;
import com.proyecto.service.DistritosService;

@Controller
@CrossOrigin(origins = "*", methods = {RequestMethod.GET,RequestMethod.POST,
		RequestMethod.DELETE,RequestMethod.PUT})
@RequestMapping("distritos")
public class DistritosController {

	@Autowired
	DistritosService service;
	
	@GetMapping("/listar")
	public List<Distritos>listarDistritos(){
		return service.listarDistritos();
	}
}
