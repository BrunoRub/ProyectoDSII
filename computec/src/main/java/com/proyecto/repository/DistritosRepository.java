package com.proyecto.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.proyecto.entity.Distritos;

@Repository
public interface DistritosRepository extends CrudRepository<Distritos, Integer>{

}
