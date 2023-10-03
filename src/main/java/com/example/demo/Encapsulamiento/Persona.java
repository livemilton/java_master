package com.example.demo.Encapsulamiento;

public class Persona {
    // Atributos de la clase
    private String nombre;
    private double sueldo;
    private boolean eliminado;

    // constructor de la clase
    public Persona(String nombre, double sueldo, boolean eliminado) {
        this.nombre = nombre;
        this.sueldo = sueldo;
        this.eliminado = eliminado;
    }

    // metodos getter y setters

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSueldo() {
        return this.sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public boolean isEliminado() {
        return this.eliminado;
    }

    public void setEliminado(boolean eliminado) {
        this.eliminado = eliminado;
    }

    // metodo to string
    public String toString() {
        return "nombre: " + nombre + ", sueldo: " + sueldo + ", eliminado: " + eliminado;
    }
}
