package com.example.microusuarios.dto;

import java.util.List;

public class UsuarioDTO {
	private String user;
	private String email;
	private String password;
	private List<RoleDTO> rolesDTO;
	public UsuarioDTO(String user, String email, String password) {
		super();
		this.user = user;
		this.email = email;
		this.password = password;
	}
	
	
	public UsuarioDTO() {
		super();
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public List<RoleDTO> getRolesDTO() {
		return rolesDTO;
	}
	public void setRolesDTO(List<RoleDTO> rolesDTO) {
		this.rolesDTO = rolesDTO;
	}
	
	
	
	
	
	
}
