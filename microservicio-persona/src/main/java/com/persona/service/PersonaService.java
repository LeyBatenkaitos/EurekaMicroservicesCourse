package com.persona.service;

import java.util.List;

import com.persona.model.PersonaRest;

public interface PersonaService {

	List<PersonaRest> getPersonas();
	
	PersonaRest getPersonasById(Long id);
	
}
