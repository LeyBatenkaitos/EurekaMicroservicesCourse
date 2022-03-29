package com.persona.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.persona.model.PersonaRest;
import com.persona.service.PersonaService;

@RestController
public class PersonaController {

	@Autowired
	private PersonaService personaService;
	
	@GetMapping("/personas")
	public ResponseEntity<List<?>> getPersonas(){
		
		List<PersonaRest> listPersonaRest = personaService.getPersonas();
		
		return new ResponseEntity<List<?>>(listPersonaRest,HttpStatus.OK);
	}
	
	@GetMapping("/personas/{id}")
	public ResponseEntity<?> getPersonas(@PathVariable(value = "id") Long id){
		
		PersonaRest personaRest = personaService.getPersonasById(id);
		
		return new ResponseEntity<PersonaRest>(personaRest,HttpStatus.OK);
	}
	
}
