package com.example.microusuarios.service;

import java.util.List;

import com.example.microusuarios.dto.UsuarioDTO;

public interface UsuarioService {
	
	public List<UsuarioDTO> getUsuarios();

	public void delete_user(String user);
	public UsuarioDTO find_cliente_by_user(String user);
	public void update_cliente_by_user(UsuarioDTO usuariodto);

}
