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
@Table(name="tb_proveedores")
@Getter
@Setter
public class Proveedores {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_prov;
	
	@Column(name = "rs_prov", nullable = false, length = 45)
	private String rs_prov;
	
	@Column(name = "nom_usu", nullable = false, length = 11)
	private String ruc_prov;
	
	@Column(name = "dir_prov", nullable = false, length = 45)
	private String dir_prov;
	
	@Column(name = "nom_usu", nullable = false, length = 9)
	private String tel_prov;
	
	@ManyToOne
	private Distritos id_dis;
}
