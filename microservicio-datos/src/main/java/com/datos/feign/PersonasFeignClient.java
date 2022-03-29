package com.datos.feign;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.datos.model.DatosPersonaRest;

@FeignClient(name="microservicio-persona",url="localhost:8000")
public interface PersonasFeignClient {

	@GetMapping("/personas")
	public List<DatosPersonaRest> getPersonas(); 
	
	@GetMapping("/personas/{id}")
	public DatosPersonaRest getDatosById(@PathVariable(value = "id") Long id); 
	
	
}
