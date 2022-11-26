package com.votacion.sistema.models;

import java.util.Collection;

import javax.persistence.*;

@Entity
@Table(name = "usuario")
public class Usuario {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	private Integer id_usuario;

	private String nombre;
	private String apellido;
	private String dui;
	private String fotoUrl;
	private String contrasena;
	@ManyToMany(fetch=FetchType.EAGER,cascade=CascadeType.ALL)
	@JoinTable(
			name="usuarios_roles",
			joinColumns = @JoinColumn(name="usuario_id",referencedColumnName="id_usuario"),
			inverseJoinColumns = @JoinColumn(name="rol_id",referencedColumnName="id")
			)
	private Collection<Rol> roles;

	@OneToOne
	@JoinColumn(name = "id_papeleta")
	private Papeleta papeleta;

	public Integer getId_usuario() {
		return id_usuario;
	}

	public void setId_usuario(Integer id_usuario) {
		this.id_usuario = id_usuario;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getDUI() {
		return dui;
	}

	public void setDUI(String DUI) {
		this.dui = DUI;
	}

	public String getFotoUrl() {
		return fotoUrl;
	}

	public void setFotoUrl(String fotoUrl) {
		this.fotoUrl = fotoUrl;
	}

	public Papeleta getPapeleta() {
		return papeleta;
	}

	public void setPapeleta(Papeleta papeleta) {
		this.papeleta = papeleta;
	}

	public String getContrasena() {
		return contrasena;
	}

	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}
	public Collection<Rol> getRoles() {
		return roles;
	}

	public void setRoles(Collection<Rol> roles) {
		this.roles = roles;
	}

	public Usuario(Integer id_usuario, String nombre, String apellido, String dui, String fotoUrl, String contrasena,
			Papeleta papeleta) {
		super();
		this.id_usuario = id_usuario;
		this.nombre = nombre;
		this.apellido = apellido;
		this.dui = dui;
		this.fotoUrl = fotoUrl;
		this.contrasena = contrasena;
		this.papeleta = papeleta;
	}

	public Usuario(String nombre, String apellido, String dui, String fotoUrl, String contrasena, Papeleta papeleta) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.dui = dui;
		this.fotoUrl = fotoUrl;
		this.contrasena = contrasena;
		this.papeleta = papeleta;
	}

	public Usuario() {
		super();
	}

	public Usuario(String nombre, String apellido, String dui, String contrasena) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.dui = dui;
		this.contrasena = contrasena;
	}

	public Usuario(String nombre, String apellido, String dui, String fotoUrl, String contrasena, Collection<Rol> roles,
			Papeleta papeleta) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.dui = dui;
		this.fotoUrl = fotoUrl;
		this.contrasena = contrasena;
		this.setRoles(roles);
		this.papeleta = papeleta;
	}

	public Usuario(String nombre, String apellido, String dui, String contrasena, Collection<Rol> roles) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.dui = dui;
		this.contrasena = contrasena;
		this.roles = roles;
	}



}
