package com.babel.loteriaPrimitiva.Servicio.Interfaces;

import java.util.List;

public interface IApuestaServicio {
    void registrarApuesta(int userId, List<Integer> numeros);
    List<Integer> obtenerApuesta(int userId, int apuestaId);
}
