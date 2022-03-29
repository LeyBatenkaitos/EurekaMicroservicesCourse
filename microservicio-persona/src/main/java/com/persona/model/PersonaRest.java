package com.persona.model;

import java.util.Date;


public class PersonaRest {

	private Long id;
	private String username;
	private String nombre;
	private String apellido;
	private Date fechaNacimiento;
	private String direccion;
	private String balanceador;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getBalanceador() {
		return balanceador;
	}
	public void setBalanceador(String balanceador) {
		this.balanceador = balanceador;
	}
	
	
}
