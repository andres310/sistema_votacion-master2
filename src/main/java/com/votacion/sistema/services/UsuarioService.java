package com.votacion.sistema.services;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.votacion.sistema.dto.UsuarioRegistroDTO;
import com.votacion.sistema.models.Usuario;

public interface UsuarioService extends UserDetailsService {
	
	public Usuario guardarUsuario(UsuarioRegistroDTO registroDTO);
	
	
}
