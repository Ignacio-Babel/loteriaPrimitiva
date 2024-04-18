package com.babel.loteriaPrimitiva.Controlador.Interfaces;

import com.babel.loteriaPrimitiva.Modelo.Usuario;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface IUsuarioControlador {

	List<Usuario> list(int id);

	void addUser(@PathVariable int userID, @RequestBody String nombreUsuario);
}
