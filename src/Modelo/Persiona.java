package Modelo;

import Vista.boyfriendventana1;
import Vista.boyfriendventana2;

public class Persiona {

	private String nombre;
	private String apellido;
	private String telefono;
	
	public Persiona(String nombre, String apellido, String telefono) {
	    this.nombre = nombre;
	    this.apellido = apellido;
	    this.telefono = telefono;
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
	
	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
	
	private boyfriendventana1 boyfriendventana1;
	private boyfriendventana2 boyfriendventana2;
	public void setVista(boyfriendventana1 boyfriendventana1, boyfriendventana2 boyfriendventana2) {
		this.boyfriendventana1 = boyfriendventana1;
		this.boyfriendventana2 = boyfriendventana2;
		
	}
}
