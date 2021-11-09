package com.proyecto.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.proyecto.entity.Pedidos;

public interface PedidosRepository extends JpaRepository<Pedidos, Integer> {

}
