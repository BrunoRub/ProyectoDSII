package com.proyecto.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="tb_pedidos")
@Getter
@Setter
public class Pedidos {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_ped;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Column(name = "fec_ped", nullable = false, length = 45)
	private Date fec_ped;
	
	@ManyToOne
	@JoinColumn(name = "id_usu")
	private Usuarios usuarios;
	
	@Column(name = "num_ped", precision = 10, scale = 2)
	private int num_ped;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Column(name = "fent_ped", nullable = false, length = 45)
	private Date fent_ped;
	
	
}


