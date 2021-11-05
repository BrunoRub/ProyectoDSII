package com.proyecto.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="tb_productos")
@Getter
@Setter
public class Productos {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_pro;
	
	@Column(name = "des_pro", nullable = false, length = 45)
	private String des_pro;
	
	@Column(name = "pre_pro", precision = 10, scale = 2)
	private double pre_pro;
	
	@Column(name = "sto_pro", precision = 10, scale = 2)
	private int sto_pro;
	
	@Column(name = "est_pro", precision = 10, scale = 2)
	private int est_pro;
	
	@ManyToOne
	private Categorias id_cat;
	
	@ManyToOne
	private Proveedores id_prov;
}
