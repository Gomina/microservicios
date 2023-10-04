package com.example.microusuarios.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.microusuarios.dto.UsuarioDTO;
import com.example.microusuarios.service.UsuarioService;

@RestController
@RequestMapping("/api/usuarios")
public class MiControladorRest {
	
	@Autowired
	UsuarioService usuarioService;
	
	@GetMapping("listado_usuarios")
	public ResponseEntity<List<UsuarioDTO>> get_usuarios(){
		if(usuarioService.getUsuarios()==null||usuarioService.getUsuarios().size()==0) {
			return ResponseEntity.noContent().build();
		}
		return ResponseEntity.ok(usuarioService.getUsuarios());
	}
	
	
	@GetMapping("/{user}")
	public ResponseEntity<UsuarioDTO> get_usuario(@PathVariable("user") String user){
		if(usuarioService.find_cliente_by_user(user)==null) {
			return ResponseEntity.noContent().build();
		}
		return ResponseEntity.ok(usuarioService.find_cliente_by_user(user));
	}
	
	@DeleteMapping("/{user}")
	public ResponseEntity<Integer> delete_user(@PathVariable("user") String user){
		if(usuarioService.find_cliente_by_user(user)==null) {
			return ResponseEntity.ok(1);
		}
		usuarioService.delete_user(user);
		return ResponseEntity.ok(0);
	}
	
	@PostMapping
	public ResponseEntity<Integer>add_cliente(@RequestBody UsuarioDTO usuariodto){
		UsuarioDTO userdto = usuarioService.find_cliente_by_user(usuariodto.getUser());
		if(userdto==null) {
			usuarioService.update_cliente_by_user(usuariodto);
			return ResponseEntity.ok(0);
		}else {
			return ResponseEntity.ok(1);
		}
	}
	
	@PutMapping
	public ResponseEntity<Integer>update_usuario(@RequestBody UsuarioDTO usuariodto){
		UsuarioDTO userdto = usuarioService.find_cliente_by_user(usuariodto.getUser());
		if(userdto!=null) {
			usuarioService.update_cliente_by_user(usuariodto);
			return ResponseEntity.ok(0);
		}else {
			return ResponseEntity.ok(1);
		}
	}

}
