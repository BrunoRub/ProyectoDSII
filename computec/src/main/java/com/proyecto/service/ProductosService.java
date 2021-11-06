package com.proyecto.service;

import java.util.List;

import com.proyecto.entity.Productos;

public interface ProductosService {

	public List<Productos> listaProductos();
	public Productos registraProducto(Productos p);
}
