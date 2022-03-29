package com.datos.model;

import java.util.Date;

public class DatosPersonaRest {

	private String usernames;
	private String nombre;
	private String apellido;
	private Date fechaNacimiento;
	private String direccion;
	private String balanceador;
	
	
	
	
	public String getUsernames() {
		return usernames;
	}
	public void setUsernames(String usernames) {
		this.usernames = usernames;
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
