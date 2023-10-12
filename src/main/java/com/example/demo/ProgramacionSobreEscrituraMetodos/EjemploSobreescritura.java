package com.example.demo.ProgramacionSobreEscrituraMetodos;

public class EjemploSobreescritura {

    public static void main(String[] args) {

        Empleado empleado = new Empleado("Juan", 1000);

        System.out.println("empleado = " + empleado.obtenerDetalles());

        Gerente gerente = new Gerente("karla", 2000, "Finanzas");

        System.out.println("Gerente = " + gerente.obtenerDetalles());
    }
}
