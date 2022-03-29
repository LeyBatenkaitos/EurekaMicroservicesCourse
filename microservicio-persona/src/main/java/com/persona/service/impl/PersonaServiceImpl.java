package com.persona.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.persona.entity.PersonaEntity;
import com.persona.model.PersonaRest;
import com.persona.repository.PersonaRepository;
import com.persona.service.PersonaService;

@Service
public class PersonaServiceImpl implements PersonaService {

	@Autowired
	private PersonaRepository personaRepository;
	
	@Override
	public List<PersonaRest> getPersonas() {

		List<PersonaEntity> listPersonaEntity = personaRepository.findAll();
		
		List<PersonaRest> listPersonaRest = new ArrayList<>();
		
		listPersonaEntity.stream().forEach(persona->{
			
			PersonaRest newPersonaRest = new PersonaRest();
			
			newPersonaRest.setApellido(persona.getApellido());
			newPersonaRest.setBalanceador(persona.getBalanceador());
			newPersonaRest.setDireccion(persona.getDireccion());
			newPersonaRest.setFechaNacimiento(persona.getFechaNacimiento());
			newPersonaRest.setId(persona.getId());
			newPersonaRest.setNombre(persona.getNombre());
			newPersonaRest.setUsername(persona.getUsername());
			
			listPersonaRest.add(newPersonaRest);
		});
		
		
		return listPersonaRest;
	}

	@Override
	public PersonaRest getPersonasById(Long id) {
		PersonaEntity persona = personaRepository.findById(id).get();	
		
		PersonaRest newPersonaRest = new PersonaRest();
		
		newPersonaRest.setApellido(persona.getApellido());
		newPersonaRest.setBalanceador(persona.getBalanceador());
		newPersonaRest.setDireccion(persona.getDireccion());
		newPersonaRest.setFechaNacimiento(persona.getFechaNacimiento());
		newPersonaRest.setId(persona.getId());
		newPersonaRest.setNombre(persona.getNombre());
		newPersonaRest.setUsername(persona.getUsername());
		
		return newPersonaRest;
	}

}
