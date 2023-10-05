package com.example.milanuncios.services;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.milanuncios.util.Usuario;


@FeignClient("microusuarios/api/usuarios")
public interface IUsuarioService {
	
	
	@GetMapping("listado_usuarios")
	public List<Usuario> get_usuarios();
	
	
	@GetMapping("/{user}")
	public Usuario get_usuario(@PathVariable("user") String user);
	
	@DeleteMapping("/{user}")
	public void delete_user(@PathVariable("user") String user);

}
