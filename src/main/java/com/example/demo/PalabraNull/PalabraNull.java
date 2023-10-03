package com.example.demo.PalabraNull;

public class PalabraNull {

    public static void main(String[] args) {
        // Creación del objeto
        Persona persona1 = new Persona("Juan");
        // imprimir objeto con el metodo
        System.out.println("persona1: " + persona1.obtenerNombre());
        // creacion objeto 2
        Persona persona2 = persona1;
        // imprimir objeto con el metodo
        System.out.println("persona2: " + persona2.obtenerNombre());

        // validacion y asignacion null al objeto 1 se pierde la referencia
        persona1 = null;
        if (persona1 != null) {
            System.out.println("persona1: " + persona1.obtenerNombre());
        } else {
            System.out.println("la variable persona1 no apunta a ningun objeto");
        }

        // null a objeto 2
        persona2 = null;
        // recolector garbage colector
        System.gc();// Garbage collector solo planifica la llamada

    }

}

// clase persona
class Persona {
    // atributo
    String nombre;

    // constructor
    Persona(String nombre) {
        this.nombre = nombre;
    }

    // metodo
    public String obtenerNombre() {
        return this.nombre;
    }
}