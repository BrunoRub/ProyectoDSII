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
@Table(name="tb_detpedido")
@Getter
@Setter
public class DetPedidos {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_det;
	
	@Column(name = "cantidad", precision = 10, scale = 2)
	private int cantidad;
	
	@Column(name = "precio", precision = 10, scale = 2)
	private double precio;
	
	@ManyToOne
	private Pedidos id_ped;
	
	@ManyToOne
	private Productos id_pro;
}
