package com.datos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.datos.model.DatosPersonaRest;
import com.datos.service.DatosService;

@RestController
public class DatosController {

	@Autowired
	private DatosService datosService;
	
	@GetMapping("/datos")
	public List<DatosPersonaRest> getDatosPersonas(){
		
		List<DatosPersonaRest> listDatosPersonaRest = datosService.getDatos();
		
		return listDatosPersonaRest;
	}
	
	@GetMapping("/datos/{id}")
	public DatosPersonaRest getDatosPersonaById(@PathVariable(value = "id") Long id){
		
		DatosPersonaRest datosPersonaRest = datosService.getDatosById(id);
		
		return datosPersonaRest;
	}
}
