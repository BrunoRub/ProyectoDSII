package com.proyecto.service;

import java.util.List;

import com.proyecto.entity.Proveedores;

public interface ProveedoresService  {

	public abstract List<Proveedores> listaProveedor();
	public abstract Proveedores registraProveedor(Proveedores pr);
}
