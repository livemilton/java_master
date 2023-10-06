package com.example.demo.SobrecargaConstructores;

public class SobrecargaContructores {

    public static void main(String[] args) {

        Persona persona1 = new Persona("juan", 20);

        System.out.println("Persona1: " + persona1);

        Empleado empleado1 = new Empleado("Karla", 30, 4000);
        System.out.println("Empleado1: " + empleado1);
    }
}
