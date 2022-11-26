package com.votacion.sistema.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RegistroLogController {
	@GetMapping("/login")
	public String iniciarSesion() {
		return "login";
	}
	@GetMapping("/")
	public String verPaginaInicio(Model model) {
		model.addAttribute("titulo", "Elecciones presidenciales 2022");
		return "index";
	}

	
}
