package com.proyecto.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.proyecto.entity.Pedidos;
import com.proyecto.service.PedidosService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;
import utils.Constantes;

@RestController
@RequestMapping("/rest/Pedidos")
public class PedidosController {
	
	@Autowired
	private  PedidosService pedidoService;
	
	
	@PostMapping
	@ResponseBody
	public ResponseEntity<Map<String, Object>> insertaPedidos(@RequestBody Pedidos obj) {
		Map<String, Object> salida = new HashMap<>();
		try {
			 Pedidos objSalida = pedidoService.registraPedidos(obj);
			if (objSalida == null) {
				salida.put("mensaje", Constantes.MENSAJE_REG_ERROR);
			} else {
				salida.put("mensaje", Constantes.MENSAJE_REG_EXITOSO);
			}
		} catch (Exception e) {
			e.printStackTrace();
			salida.put("mensaje", Constantes.MENSAJE_REG_ERROR);
		}
		return ResponseEntity.ok(salida);
	}
	

}
