package com.proyecto.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.proyecto.entity.Seleccion;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@CrossOrigin(origins = "*", methods = {RequestMethod.GET,RequestMethod.POST,RequestMethod.DELETE,RequestMethod.PUT})
@RequestMapping("seleccion")
public class SeleccionController {

	static List<Seleccion>seleccionados = new ArrayList<Seleccion>();
	
	@PostMapping("/agregarSeleccion")
	public int registre(@RequestBody Seleccion seleccion) {
		seleccionados.add(seleccion);
		System.out.println(seleccion.getNombre());
		return seleccionados.size();
	}
	
	@DeleteMapping("/eliminarSeleccion/{idProducto}")
	public void registra(@PathVariable("idProducto")int idProducto) {
		for(int i = 0; i<seleccionados.size();i++) {
			if(seleccionados.get(i).getCodigo() == idProducto) {
				seleccionados.remove(i);
			}
		}
	}
	
	@GetMapping("listarSeleccionados")
	public List<Seleccion>listar(){
		return seleccionados;
	}
}
