package com.babel.loteriaPrimitiva.Servicio.Clases;

import com.babel.loteriaPrimitiva.Modelo.Usuario;
import com.babel.loteriaPrimitiva.Servicio.Interfaces.IUsuarioServicio;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.Map;

public class UsuarioServicio implements IUsuarioServicio {

    private static final Logger logger = LoggerFactory.getLogger(UsuarioServicio.class);
    private Map<Integer, Usuario> users = new HashMap<>();

    public void registrarUsuario(int id, String name) {
        if (!users.containsKey(id)) {
            Usuario usuario = new Usuario(id, name);
            users.put(id, usuario);
        }
    }

    public Usuario getUsuarioById(int id) {
        return users.get(id);
    }
}
