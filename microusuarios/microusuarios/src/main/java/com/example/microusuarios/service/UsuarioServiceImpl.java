package com.example.microusuarios.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.microusuarios.dto.UsuarioDTO;
import com.example.microusuarios.model.Usuario;
import com.example.microusuarios.repository.UsuarioRepository;


@Service
public class UsuarioServiceImpl implements UsuarioService{
	
	
	
	@Autowired
	UsuarioRepository usuarioRepository;
	
	@Override
	public List<UsuarioDTO> getUsuarios() {
		List<Usuario> usuarios = usuarioRepository.findAll();
		List<UsuarioDTO> usuariosDTO = new ArrayList<UsuarioDTO>();
		
		for (Usuario usuario : usuarios) {
			UsuarioDTO usuarioDTO = new UsuarioDTO(usuario.getUser(), usuario.getEmail(), usuario.getPassword());
			usuariosDTO.add(usuarioDTO);
		}
		
		return usuariosDTO;
	}
	
	@Override
	public UsuarioDTO find_cliente_by_user(String user) {
		Usuario usuario=usuarioRepository.findById(user).orElse(null);
		UsuarioDTO usuariodto;
		if (usuario==null)return null;
		else {
			usuariodto=new UsuarioDTO(usuario.getUser(),usuario.getEmail(),usuario.getPassword());
		}
		return usuariodto;
	}

	@Override
	public void delete_user(String user) {
		usuarioRepository.deleteById(user);
		
	}

	

	@Override
	public void update_cliente_by_user(UsuarioDTO usuariodto) {
		Usuario usuario=new Usuario(usuariodto.getUser(),usuariodto.getEmail(),usuariodto.getPassword());
		usuarioRepository.save(usuario);
		
	}

}
