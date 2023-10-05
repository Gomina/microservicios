package com.example.milanuncios.util;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName("Usuario")
public class Usuario {
	private String user;
	private String email;
	private String password;
	private List<Role> rolesDTO;
	public Usuario(String user, String email, String password) {
		super();
		this.user = user;
		this.email = email;
		this.password = password;
	}
	
	
	public Usuario() {
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
	public List<Role> getRolesDTO() {
		return rolesDTO;
	}
	public void setRolesDTO(List<Role> rolesDTO) {
		this.rolesDTO = rolesDTO;
	}
	
	
	
	
	
	
}
