package com.example.demo.ProgramacionManejoGenericos;

public class ClaseGenerica<T> {

    // Variable de tipo generico
    T objeto;

    // Constructor que inicializa el tipo a utilizar la clase generica
    public ClaseGenerica(T objeto) {
        this.objeto = objeto;
    }

    // Metodo de la clase generica
    public void obtenerTipo() {
        System.out.println("El tipo T es: " + objeto.getClass().getSimpleName());
    }

}
