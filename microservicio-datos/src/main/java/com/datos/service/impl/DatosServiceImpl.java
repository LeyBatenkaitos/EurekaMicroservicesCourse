package com.datos.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.datos.feign.PersonasFeignClient;
import com.datos.model.DatosPersonaRest;
import com.datos.service.DatosService;

@Service
public class DatosServiceImpl implements DatosService {

	@Autowired
	private PersonasFeignClient personasFeignClient;
	
	@Override
	public List<DatosPersonaRest> getDatos() {
		
		List<DatosPersonaRest> listDatosPersonaRest = personasFeignClient.getPersonas();
		
		return listDatosPersonaRest;
	}

	@Override
	public DatosPersonaRest getDatosById(Long id) {
		DatosPersonaRest datosPersonaRest = personasFeignClient.getDatosById(id);
		
		return datosPersonaRest;
	}

}
