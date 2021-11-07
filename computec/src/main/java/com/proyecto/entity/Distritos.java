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
@Table(name="tb_distritos")
@Getter
@Setter
public class Distritos {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_dis;
	
	@Column(name = "nom_dis", nullable = false, length = 45)
	private String nom_dis;

}
