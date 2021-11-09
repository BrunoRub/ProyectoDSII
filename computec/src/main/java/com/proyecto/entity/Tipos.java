package com.proyecto.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="tb_tipos")
@Getter
@Setter
public class Tipos {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_tipo;
	
	@Column(name = "des_tipo", nullable = false, length = 45)
	private String des_tipo;
}

