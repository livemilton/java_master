package com.example.demo.OperadoresJava;

public class OperadoresJava {

    public static void main(String[] args) {

        int a = 3, b = 2;

        int resultado = a + b;
        System.out.println("******SUMA*********");
        System.out.println("Resultado suma = " + resultado);
        System.out.println("Resultao suma= " + (a + b));

        System.out.println("******RESTA*********");
        resultado = a - b;
        System.out.println("Resultado resta = " + resultado);
        System.out.println("Resultado resta = " + (a - b));

        System.out.println("******MULTIPLICACION*********");
        resultado = a * b;
        System.out.println("Resultado multiplicacion = " + resultado);

        System.out.println("******DIVISIÓN*********");
        float resultado2 = 3F / b;
        System.out.println("Resultado division = " + resultado2);

        System.out.println("******MODULO*********");
        resultado = a % b;
        System.out.println("Resultado modulo = " + resultado);

        resultado = a % 2;
        System.out.println("Resultado modulo = " + resultado);

        resultado = 123 % 2;
        System.out.println("Resultado modulo = " + resultado);

        if (resultado == 0) {
            System.out.println("Es numero par");
        } else {
            System.out.println("es numero impar");
        }
    }

}
