package com.proyecto.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class EnlaceController {
	
	@RequestMapping(value = "/" , method = RequestMethod.GET)
	@GetMapping(value = "/" )
	public String index() {
		return "index";
	}
}
