package com.example.demo.SobrecargaConstructores;

public class Empleado extends Persona {

    // Atributos de la clase
    private double sueldo;

    // COnstructor con el llamado a la clase padre
    public Empleado(String nombre, int edad) {
        super(nombre, edad);
        // TODO Auto-generated constructor stub
    }

    // COnstructor sobrecargado
    public Empleado(String nombre, int edad, double sueldo) {
        // this(nombre,edad);
        super(nombre, edad);
        this.sueldo = sueldo;
    }

    public double getSueldo() {
        return this.sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return super.toString() + "Empleado [sueldo=" + sueldo + "]";
    }

}
