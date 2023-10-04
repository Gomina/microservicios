package com.example.microusuarios.dto;


import java.util.List;

public class RoleDTO {
	private String role;
	private String funcion;
	
	private List<UsuarioDTO> usuariosDTO;

	public RoleDTO(String role, String funcion) {
		super();
		this.role = role;
		this.funcion = funcion;
	}

	public RoleDTO(String role) {
		super();
		this.role = role;
	}

	public RoleDTO() {
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

	public List<UsuarioDTO> getUsuariosDTO() {
		return usuariosDTO;
	}

	public void setUsuariosDTO(List<UsuarioDTO> usuariosDTO) {
		this.usuariosDTO = usuariosDTO;
	}
	
	
	
}
