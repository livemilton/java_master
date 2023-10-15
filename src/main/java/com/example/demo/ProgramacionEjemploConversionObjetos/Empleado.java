package com.example.demo.ProgramacionEjemploConversionObjetos;

public class Empleado {

    // Atributos de la clase Empleado
    protected String nombre;
    protected double sueldo;

    // Constructor con 2 argumentos en la clase Empleado

    public Empleado(String nombre, double sueldo) {
        this.nombre = nombre;
        this.sueldo = sueldo;
    }

    // Metodo de la clase Empleado (obtenerDetalles)

    public String obtenerDetalles() {
        return "Nombre: " + this.nombre + ", sueldo: " + this.sueldo;

    }

    // Getters y Setters de la clase Empleado

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

}
