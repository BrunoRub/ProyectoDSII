package com.proyecto.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.proyecto.entity.Tipos;

@Repository
public interface TiposRepository extends JpaRepository<Tipos, Integer>{

}
