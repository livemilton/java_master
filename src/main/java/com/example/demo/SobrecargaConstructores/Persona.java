package com.example.demo.SobrecargaConstructores;

public class Persona {

    private int idPersona;
    private String nombre;
    private int edad;
    private static int contadorPersonas;

    // 1 constructor
    private Persona() {
        // se llama de la clase padre object
        super();
        this.idPersona = ++contadorPersonas;
    }

    // 2 constructor completo - sobrecargado

    public Persona(String nombre, int edad) {
        // llamar constructor privado y vacio de la clase
        this();
        this.nombre = nombre;
        this.edad = edad;

    }

    public int getIdPersona() {
        return idPersona;
    }

    // no se utiliza
    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public static int getContadorPersonas() {
        return contadorPersonas;
    }

    // no se utiliza
    public static void setContadorPersonas(int contadorPersonas) {
        Persona.contadorPersonas = contadorPersonas;
    }

    @Override
    public String toString() {
        return "Persona [idPersona=" + idPersona + ", nombre=" + nombre + ", edad=" + edad + "]";
    }

}
