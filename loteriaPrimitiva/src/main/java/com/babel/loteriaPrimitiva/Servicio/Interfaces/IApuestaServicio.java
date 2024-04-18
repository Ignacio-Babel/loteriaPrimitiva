package com.babel.loteriaPrimitiva.Servicio.Interfaces;

import com.babel.loteriaPrimitiva.Modelo.Apuesta;

import java.util.Scanner;

public interface IApuestaServicio {

    void inicializarSetApuestas();

    boolean agregarApuesta(Apuesta apuesta);

    Apuesta crearApuesta();


}
