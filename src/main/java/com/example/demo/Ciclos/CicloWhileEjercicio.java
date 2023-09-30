package com.example.demo.Ciclos;

public class CicloWhileEjercicio {
    public static void main(String[] args) {

        // ciclo while
        int contador = 0;
        while (contador < 3) {
            System.out.println("contador = " + contador);
            contador++;
        }
        // ciclo do while
        do {
            System.out.println("contador = " + contador);
            contador++;
        } while (contador < 3);
    }
}
