package com.babel.loteriaPrimitiva.Servicio.Clases;

import com.babel.loteriaPrimitiva.Modelo.Usuario;
import com.babel.loteriaPrimitiva.Servicio.Interfaces.IUsuarioServicio;

import java.util.HashMap;
import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class UsuarioServicio implements IUsuarioServicio {
    private static Logger logger = LoggerFactory.getLogger(UsuarioServicio.class);
    private Map<Integer, Usuario> users = new HashMap<>();

    public void registrarUsuario(int id, String name) {
        if (!users.containsKey(id)) {
            Usuario usuario = new Usuario(id, name);
            users.put(id, usuario);
            logger.info("Usuario registrado - ID: {"+id+"}, Nombre: {"+name+"}");
        } else {
            logger.warn("Usuario registrado con ID duplicado: {"+id+"}");

        }
    }

    public Usuario getUsuarioById(int id) {
        return users.get(id);
    }
}
