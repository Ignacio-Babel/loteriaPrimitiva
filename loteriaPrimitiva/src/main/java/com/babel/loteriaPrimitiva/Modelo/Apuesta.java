package com.babel.loteriaPrimitiva.Modelo;

import java.util.Objects;
import java.util.Set;

public class Apuesta {

    private Set<Integer> numerosApuesta;

    public Apuesta(){};

    public Apuesta(Set<Integer> numerosApuesta) {
        this.numerosApuesta = numerosApuesta;
    }

    public void agregarNumero(int numero) {
            numerosApuesta.add(numero);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Apuesta apuesta = (Apuesta) o;
        return Objects.equals(numerosApuesta, apuesta.numerosApuesta);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numerosApuesta);
    }
}
