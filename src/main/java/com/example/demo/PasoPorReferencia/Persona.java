package com.example.demo.PasoPorReferencia;

public class Persona {

    String nombre;

    public String obtenerNombre() {
        return this.nombre;
    }

    public void cambiarNombre(String nuevoNombre) {
        this.nombre = nuevoNombre;
    }

    public Persona() {
        System.out.println("Ejecutando constructor Vacio");
    }
}
