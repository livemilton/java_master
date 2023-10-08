package com.example.demo.EjemploArreglos;

public class Persona {

    // Atributos de la clase
    private String nombre;

    // constructor
    public Persona(String nombre) {
        this.nombre = nombre;
    }

    // Getter y setter

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Metodo to string
    @Override
    public String toString() {
        return "Persona [nombre=" + nombre + "]";
    }

}
