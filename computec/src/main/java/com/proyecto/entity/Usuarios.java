package com.proyecto.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="tb_usuarios")
@Getter
@Setter
public class Usuarios {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_usu;
	
	@Column(name = "nom_usu", nullable = false, length = 45)
	private String nom_usu;
	
	@Column(name = "ape_usu", nullable = false, length = 45)
	private String ape_usu;

	@Column(name = "user_usu", nullable = false, length = 45)
	private String user_usu;

	@Column(name = "cla_usu", nullable = false, length = 10)
	private String cla_usu;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Column(name = "fnac_usu", nullable = false, length = 45)
	private String fnac_usu;
	
	@Column(name = "est_usu", nullable = false)
	private String est_usu;
	
	@ManyToOne
	private Tipos id_tipos;
	
	
}
