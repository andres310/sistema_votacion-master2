package com.votacion.sistema.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.votacion.sistema.models.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, String>{

	public Usuario findByDui(String dui);
	
	
}
