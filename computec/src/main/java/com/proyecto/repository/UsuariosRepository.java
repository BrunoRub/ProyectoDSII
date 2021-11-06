package com.proyecto.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.proyecto.entity.Usuarios;

public interface UsuariosRepository extends JpaRepository<Usuarios, Integer>{

	@Query("select u from Usuario u where u.usuario = ?1 and u.passwordUsuario = ?2")
	public Usuarios iniciarSesion(String usuario, String password);
}
