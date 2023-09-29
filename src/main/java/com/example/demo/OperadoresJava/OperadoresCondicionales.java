package com.example.demo.OperadoresJava;

public class OperadoresCondicionales {
    public static void main(String[] args) {

        System.out.println("*****CONDICIONAL && *******");
        int a = 15;
        int valorMinimo = 0, valorMaximo = 10;
        boolean resultado = a >= valorMinimo && a <= valorMaximo;
        System.out.println("resultado = " + resultado);

        System.out.println("*****CONDICIONAL || *******");
        boolean vacaciones = true;
        boolean diaDescanso = false;
        if (vacaciones || diaDescanso) {
            System.out.println("Padre puede asistir al juego del hijo");
        } else {
            System.out.println("Padre ocupado");
        }
    }
}
