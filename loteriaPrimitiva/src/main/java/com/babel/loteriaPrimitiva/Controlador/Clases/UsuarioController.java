package com.babel.loteriaPrimitiva.Controlador.Clases;

import com.babel.loteriaPrimitiva.Controlador.Interfaces.IUsuarioControlador;
import com.babel.loteriaPrimitiva.Modelo.Usuario;
import com.babel.loteriaPrimitiva.Servicio.Interfaces.IUsuarioServicio;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/users")
public class UsuarioController implements IUsuarioControlador {
	private final IUsuarioServicio usuarioServicio;

	public UsuarioController(IUsuarioServicio usuarioServicio) {
		this.usuarioServicio = usuarioServicio;
	}

	@GetMapping
	@Override
	public List<Usuario> list(int id) {
		return (List<Usuario>) this.usuarioServicio.getUsuarioById(id);
	}

	@PutMapping("/{userID}")
	@Override
	public void addUser(@PathVariable int userID, @RequestBody String nombreUsuario) {
		this.usuarioServicio.registrarUsuario(userID, nombreUsuario);
	}
}
