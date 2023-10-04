package com.example.demo.Herencia;

public class Empleado extends Persona {

    // atributos
    private int idEmpleado;
    private double sueldo;
    private static int contadorEmpleado;

    // constructor
    public Empleado(String nombre, double sueldo) {
        super(nombre);
        this.idEmpleado = ++contadorEmpleado;
        this.sueldo = sueldo;
    }

    // metodos getter y setter

    public int getIdEmpleado() {
        return this.idEmpleado;
    }

    // no se va a usar ya que se llamara el contadorEmpleado
    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public double getSueldo() {
        return this.sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public static int getContadorEmpleado() {
        return contadorEmpleado;
    }

    // no se usa, solo se incrementa en el constructor de la clase
    public static void setContadorEmpleado(int contadorEmpleado) {
        Empleado.contadorEmpleado = contadorEmpleado;
    }

    // Metodo to string de la clase
    @Override
    public String toString() {
        return super.toString() + "Empleado [idEmpleado=" + idEmpleado + ", sueldo=" + sueldo + "]";
    }

}
