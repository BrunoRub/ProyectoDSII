package com.proyecto.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.proyecto.entity.Usuarios;
import com.proyecto.service.UsuariosService;

@RestController
@CrossOrigin(origins = "*", methods = {RequestMethod.GET,RequestMethod.POST,RequestMethod.DELETE,RequestMethod.PUT})
@RequestMapping("usuario")
public class UsuariosController {

	public Usuarios usuario;
	
	@Autowired
	UsuariosService service;
	
	@GetMapping("/iniciarSesion/{usuario}/{password}")
	public Usuarios obtenerUsuario(@PathVariable("usuario") String usuario ,
			@PathVariable("password") String password) {
		this.usuario = service.iniciarSesion(usuario, password);
		return this.usuario;
	}
	
	@GetMapping("/listar")
	public List<Usuarios>listarUsuarios(){
		return service.listarUsuarios();
	}
	
	@PostMapping("/registrar")
	public Usuarios registrarUsuario(Usuarios usuario){
		return service.registrarUsuario(usuario);
	}
	
	@GetMapping("/usuarioSesion")
	public Usuarios usuarioSesion() {
		return this.usuario;
	}
	
	@GetMapping("/cerrarSesion")
	public int cerrarSesion() {
		this.usuario = null;
		SeleccionController.seleccionados.clear();
		return 1;
	}
	
}
