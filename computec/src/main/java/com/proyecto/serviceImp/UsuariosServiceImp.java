package com.proyecto.serviceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyecto.entity.Usuarios;
import com.proyecto.repository.UsuariosRepository;
import com.proyecto.service.UsuariosService;

@Service
public class UsuariosServiceImp implements UsuariosService{
	
	@Autowired
	UsuariosRepository repository;
	
	@Override
	public List<Usuarios>listarUsuarios(){
		return repository.findAll();
	}
	
	@Override
	public Usuarios registrarUsuario(Usuarios usuario) {
		return repository.save(usuario);
	}

	@Override
	public Usuarios iniciarSesion(String usuario, String password) {		
		return repository.iniciarSesion(usuario, password);
	}

}
