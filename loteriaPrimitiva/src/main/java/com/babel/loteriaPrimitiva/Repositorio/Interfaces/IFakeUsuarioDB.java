package com.babel.loteriaPrimitiva.Repositorio.Interfaces;

import com.babel.loteriaPrimitiva.Modelo.Usuario;

import java.util.List;

public interface IFakeUsuarioDB {

	public List<Usuario> listaUsuarios();
	public void nuevoUsuario(Usuario usuario);
}
