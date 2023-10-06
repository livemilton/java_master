package com.example.demo.SobrecargaMetodos;

public class SobrecargaMetodos {
    public static void main(String[] args) {

        System.out.println("Resultado 1: " + Operaciones.sumar(3, 4));

        System.out.println("Resultado 2: " + Operaciones.sumar(2, 4.0));

        System.out.println("Resultado 3:" + Operaciones.sumar(4.0, 10));

        System.out.println("Resultado 4: " + Operaciones.sumar(3, 5L));

        System.out.println("Resultado 5: " + Operaciones.sumar(3.0, 5.9));

        System.out.println("Resultado 6: " + Operaciones.sumar(3F, 'A'));
    }
}
