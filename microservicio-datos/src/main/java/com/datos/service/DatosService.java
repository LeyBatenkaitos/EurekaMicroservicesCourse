package com.datos.service;

import java.util.List;

import com.datos.model.DatosPersonaRest;

public interface DatosService {

	public List<DatosPersonaRest> getDatos();
	
	public DatosPersonaRest getDatosById(Long id);
	
}
