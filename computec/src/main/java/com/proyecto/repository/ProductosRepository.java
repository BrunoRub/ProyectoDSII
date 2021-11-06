package com.proyecto.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.proyecto.entity.Productos;

public interface ProductosRepository extends JpaRepository<Productos, Integer> {

}
