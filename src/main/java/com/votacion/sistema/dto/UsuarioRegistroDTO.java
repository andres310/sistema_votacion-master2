package com.votacion.sistema.dto;

public class UsuarioRegistroDTO {

	private Integer id_usuario;

	private String nombre;
	private String apellido;
	private String dui;
	private String fotoUrl;
	private String contrasena;

	
	//-----------	GETTERS Y SETTERS	-------------------
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

	public String getDui() {
		return dui;
	}

	public void setDui(String dui) {
		this.dui = dui;
	}

	public String getFotoUrl() {
		return fotoUrl;
	}

	public void setFotoUrl(String fotoUrl) {
		this.fotoUrl = fotoUrl;
	}

	public String getContrasena() {
		return contrasena;
	}

	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}

	// -----------	CONSTRUCTORES	-------------------
	public UsuarioRegistroDTO(Integer id_usuario, String nombre, String apellido, String dui, String fotoUrl,
			String contrasena) {
		super();
		this.id_usuario = id_usuario;
		this.nombre = nombre;
		this.apellido = apellido;
		this.dui = dui;
		this.fotoUrl = fotoUrl;
		this.contrasena = contrasena;
	}

	public UsuarioRegistroDTO(String nombre, String apellido, String dui, String fotoUrl, String contrasena) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.dui = dui;
		this.fotoUrl = fotoUrl;
		this.contrasena = contrasena;
	}

	public UsuarioRegistroDTO(String dui) {
		super();
		this.dui = dui;
	}

	public UsuarioRegistroDTO() {

	}

}
