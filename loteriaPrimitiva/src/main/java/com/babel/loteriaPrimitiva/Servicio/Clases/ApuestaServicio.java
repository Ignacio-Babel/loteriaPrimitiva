package com.babel.loteriaPrimitiva.Servicio.Clases;

import com.babel.loteriaPrimitiva.Modelo.Apuesta;
import com.babel.loteriaPrimitiva.Servicio.Interfaces.IApuestaServicio;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ApuestaServicio implements IApuestaServicio {

    private Set<Apuesta> apuestas;

    @Override
    public void inicializarSetApuestas() {
        this.apuestas = new HashSet<>();
    }

    @Override
    public boolean agregarApuesta(Apuesta apuesta) {
        if(apuestas.add(apuesta)) return true;
        return false;
    }

    @Override
    public Apuesta crearApuesta() {
        Scanner scanner = new Scanner(System.in);
        Apuesta apuesta = new Apuesta();
        for (int i = 0; i < 6; i++) {
            System.out.println("Añade el numero a la apuesta: ");
            int numero = scanner.nextInt();
                apuesta.agregarNumero(numero);
        }
        return apuesta;
    }


}
