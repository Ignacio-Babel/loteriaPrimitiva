package com.babel.loteriaPrimitiva.Modelo;

import java.util.List;
import java.util.Set;

public class Usuario {
	private int id;
	private Set<Apuesta> apuesta;

	public Usuario(int id, List<Apuesta> apuesta) {
		this.id = id;
		this.apuesta = (Set<Apuesta>) apuesta;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Set<Apuesta> getApuesta() {
		return this.apuesta;
	}

	public void setApuesta(Set<Apuesta> apuesta){
		this.apuesta = apuesta;
	}
}
