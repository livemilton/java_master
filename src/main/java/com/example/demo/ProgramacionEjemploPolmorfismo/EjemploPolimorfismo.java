package com.example.demo.ProgramacionEjemploPolmorfismo;

public class EjemploPolimorfismo {

    public static void main(String[] args) {

        Empleado empleado = new Empleado("Juan", 1000);
        imprimirDetalles(empleado);

        Gerente gerente = new Gerente("karla", 2000, "Finanzas");
        // polimorfismo
        imprimirDetalles(gerente);

    }

    public static void imprimirDetalles(Empleado empleado) {
        System.out.println("empleado = " + empleado.obtenerDetalles());
    }
}
