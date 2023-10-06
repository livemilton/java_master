package com.example.demo.SobrecargaMetodos;

public class Operaciones {

    // Metodo sumar
    public static int sumar(int a, int b) {
        System.out.println("metodo sumar(int,int)");
        return a + b;
    }

    // sobrecarga del metodo sumar
    public static double sumar(double a, double b) {
        System.out.println("metodo sumar(double, double)");
        return a + b;
    }

    // otro metodo sobrecargado
    public static double sumar(int a, double b) {
        System.out.println("metodo sumar(int, double)");
        return a + b;
    }

    // metodo final sobrecargado
    public static double sumar(double a, int b) {
        System.out.println("metodo sumar(double, int)");
        return a + b;
    }
}
