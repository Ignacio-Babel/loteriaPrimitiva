package com.babel.loteriaPrimitiva.Modelo;

import java.util.List;
import java.util.Set;

public class Usuario {
	private int id;
	private String nombre;
	private Set<Apuesta> apuesta;

	public Usuario(int id, String nombre, List<Apuesta> apuesta) {
		this.id = id;
		this.nombre = nombre;
		this.apuesta = (Set<Apuesta>) apuesta;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre(){
		return nombre;
	}

	public void setNombre(String nombre){
		this.nombre = nombre;
	}

	public Set<Apuesta> getApuesta() {
		return this.apuesta;
	}

	public void setApuesta(Set<Apuesta> apuesta){
		this.apuesta = apuesta;
	}
}
