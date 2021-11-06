package com.proyecto.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.proyecto.entity.Distritos;

@Repository
public interface DistritosRepository extends JpaRepository<Distritos, Integer>{

}
