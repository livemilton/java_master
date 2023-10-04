package com.example.demo.ContextoEstatico;

public class Persona {

    // atributos
    private int idPersona;// se asocia con un objeto (instancia)
    private String nombre;// se asocia con un objeto (instancia)
    private static int contadorPersonas;// se asocia con la clase con la palabra static

    // constructor
    public Persona(String nombre) {
        // contexto dinamico
        this.idPersona = ++contadorPersonas;
        this.nombre = nombre;
    }

    // getter y setter
    public int getIdPersona() {
        return this.idPersona;
    }

    // no se modifica directamente sino a traves del constructor de la clase
    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public static int getContadorPersonas() {
        return contadorPersonas;
    }

    @Override
    public String toString() {
        return "idPersona: " + idPersona + ", nombre: " + nombre + ", contadorPersonas: " + contadorPersonas;
    }

}
