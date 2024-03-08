package com.parcial.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.parcial.model.Persona;
import com.parcial.repository.IPersonaRepository;

@Controller
@RequestMapping("/persona")
public class PersonaController {
	
	@Autowired
	private IPersonaRepository personaRepository;

	@GetMapping ("/registro")
	private String formularioRegistro (Persona persona) {
		return "formulario";
	}
	
	@PostMapping ("/registro")
	private String registroPersona (Persona persona) {
		System.out.print("Inicio de registro");
		personaRepository.save(persona);
		return "formulario";
	}
	
}
