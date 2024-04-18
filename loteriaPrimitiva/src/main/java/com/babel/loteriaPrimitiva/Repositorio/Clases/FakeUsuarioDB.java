package com.babel.loteriaPrimitiva.Repositorio.Clases;

import com.babel.loteriaPrimitiva.Modelo.Usuario;
import com.babel.loteriaPrimitiva.Repositorio.Interfaces.IFakeUsuarioDB;

import java.util.ArrayList;
import java.util.List;

public class FakeUsuarioDB implements IFakeUsuarioDB {
	List<Usuario> usuarios;

	public FakeUsuarioDB(){
		this.usuarios = new ArrayList<>();
	}
	@Override
	public void nuevoUsuario(Usuario usuario) {
		usuarios.add(usuario);
	}
}
