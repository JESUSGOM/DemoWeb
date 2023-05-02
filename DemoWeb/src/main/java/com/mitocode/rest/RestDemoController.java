package com.mitocode.rest;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mitocode.model.Persona;
import com.mitocode.repo.IPersonaRepo;

import java.util.List;

@RestController
@RequestMapping("/persona")
public class RestDemoController {
	
	@Autowired
	private IPersonaRepo repo;
	
	@GetMapping
	public List<Persona> listigo(){
		return repo.findAll();
	}
	
	@PostMapping
	public void insertar(Persona per){
		repo.save(per);
	}

}
