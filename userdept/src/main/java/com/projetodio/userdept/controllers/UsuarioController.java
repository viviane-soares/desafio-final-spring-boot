package com.projetodio.userdept.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projetodio.userdept.entidades.Usuario;
import com.projetodio.userdept.repositories.UsuarioRepository;

@RestController
@RequestMapping(value = "/users")
public class UsuarioController {
	
	@Autowired
	private UsuarioRepository repository;
	
	@GetMapping
	public List<Usuario> findAll (){
		List<Usuario> result = repository.findAll();
		return result;
	}
	@GetMapping(value = "/{id}")
	public Usuario findById (@PathVariable Long id){
		Usuario result = repository.findById(id).get();
		return result;
	}
	
	@PostMapping
	public Usuario inserir (@RequestBody Usuario usuario){
		Usuario result = repository.save(usuario);
		return result;
	}
		
}
