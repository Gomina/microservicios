package com.example.milanuncios.util;


import java.util.List;

import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName("Role")
public class Role {
	private String role;
	private String funcion;
	
	private List<Usuario> usuarios;

	public Role(String role, String funcion) {
		super();
		this.role = role;
		this.funcion = funcion;
	}

	public Role(String role) {
		super();
		this.role = role;
	}

	public Role() {
		super();
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getFuncion() {
		return funcion;
	}

	public void setFuncion(String funcion) {
		this.funcion = funcion;
	}

	public List<Usuario> getUsuariosDTO() {
		return usuarios;
	}

	public void setUsuariosDTO(List<Usuario> usuariosDTO) {
		this.usuarios = usuariosDTO;
	}
	
	
	
}
