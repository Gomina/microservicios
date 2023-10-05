package com.example.milanuncios.controller;

import java.util.ArrayList;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.milanuncios.services.IAnuncioService;
import com.example.milanuncios.services.IUsuarioService;
import com.example.milanuncios.util.Role;
import com.example.milanuncios.util.Usuario;
import com.example.milanuncios.util.Usuario_v;


@Controller
public class MiControladorAnuncios {
	
	
	@Autowired
	IUsuarioService usuarioService;
	
//	@Autowired
//	IAnuncioService anuncioService;
	
	
	@GetMapping("/list_usuarios")
	public String getClientes(Model model) {
		List<Usuario>usuarios = usuarioService.get_usuarios();
		System.out.println(usuarios);
//		model.addAttribute("clientes",clientes);
//		return "listado_clientes";
		
		return "index";
	}
	
	@PostMapping("/save_user")
	public String saveUser(Usuario_v usuario_v, Model model, BindingResult result) {
//		usuario_v.validate(result);
//		if(result.hasErrors()) {
//			model.addAttribute("roles", roleService.getRoles());
//			return "alta_usuario";
//		}
//		if(usuarioService.findUsuarioByUser(usuario_v.getUser()) != null) {
//			model.addAttribute("roles", roleService.getRoles());
//			model.addAttribute("mensaje", "Usuario existente");
//			return "alta_usuario";
//		}
		
//		Usuario usuario = new Usuario(usuario_v.getUser(), usuario_v.getEmail(),usuario_v.getPassword());
//		Role defaultRole = new Role("user","save ads");
//		List<Role> defaultRoles = new ArrayList();
//		defaultRoles.add(defaultRole);
//		usuario.setRolesDTO(defaultRoles);
//		
//		usuarioService.saveUser(usuario);
//		return "panel_usuario";
		
	}
	
} 