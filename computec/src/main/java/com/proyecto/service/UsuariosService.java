package com.proyecto.service;

import java.util.List;

import com.proyecto.entity.Usuarios;

public interface UsuariosService {
	
	public Usuarios iniciarSesion(String usuario,String password);
	public Usuarios registrarUsuario(Usuarios usuario);
	public List<Usuarios>listarUsuarios();
}
