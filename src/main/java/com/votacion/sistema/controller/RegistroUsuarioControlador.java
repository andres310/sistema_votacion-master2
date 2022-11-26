package com.votacion.sistema.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.votacion.sistema.dto.UsuarioRegistroDTO;
import com.votacion.sistema.services.UsuarioService;

@Controller
@RequestMapping("/registro") 
public class RegistroUsuarioControlador {
	

	private UsuarioService usuarioService;
	
	public RegistroUsuarioControlador(UsuarioService usuarioService) {
		super();
		this.usuarioService=usuarioService;
	}
	@ModelAttribute("usuario")
	public UsuarioRegistroDTO retornarNuevoUsuarioRegistroDTO() {
		return new UsuarioRegistroDTO();
	}
	
	@GetMapping
	public String mostrarFormularioDeRegistro() {
		return "registro";
	}
	
	@PostMapping
	public String registrarCuentadeUsuario(@ModelAttribute("usuario") UsuarioRegistroDTO registroDTO) {
		usuarioService.guardarUsuario(registroDTO);
		return "redirect:/registro?exito";
	}
	
	
	
	
	
	
	
	
	
	
	
}
