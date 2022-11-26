package com.votacion.sistema.services;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.votacion.sistema.models.Rol;
import com.votacion.sistema.models.Usuario;
import com.votacion.sistema.repositories.UsuarioRepository;
import com.votacion.sistema.dto.UsuarioRegistroDTO;

@Service
public class UsuarioServiceImpl implements UsuarioService{

	@Autowired
	private BCryptPasswordEncoder passwordEncoder;
	
	@Autowired	
	private UsuarioRepository usuarioRepo;
	
	public UsuarioServiceImpl(UsuarioRepository usuarioRepo) {
		super();
		this.usuarioRepo = usuarioRepo;
	}
	


	@Override
	public Usuario guardarUsuario(UsuarioRegistroDTO registroDTO) {
		Usuario usuario=new Usuario(registroDTO.getNombre(),
				registroDTO.getApellido(),registroDTO.getDui(),
				passwordEncoder.encode(registroDTO.getContrasena()),
				Arrays.asList(new Rol("ROLE_USER")));
		return usuarioRepo.save(usuario);
	}



	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Usuario usuario = usuarioRepo.findByDui(username);
		if(usuario == null) {
			throw new UsernameNotFoundException("Usuario o password inválidos");
		}
		return new User(usuario.getDUI(),usuario.getContrasena(),mapearAutoridadesRoles(usuario.getRoles()) );
	}

	private Collection<? extends GrantedAuthority> mapearAutoridadesRoles(Collection<Rol> roles){
		return roles.stream().map(role -> new SimpleGrantedAuthority(role.getNombre())).collect(Collectors.toList());
	}
	

	
}
