package com.babel.loteriaPrimitiva.Servicio.Interfaces;

import com.babel.loteriaPrimitiva.Modelo.Usuario;

public interface IUsuarioServicio {
    void registrarUsuario(int id, String name);
    Usuario getUsuarioById(int id);
}
