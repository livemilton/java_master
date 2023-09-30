package com.example.demo.ProyectoAritmeticaMetodos;

public class PruebaAritmetica {

    public static void main(String[] args) {

        // Crear el objeto de tipo aritmetica
        Aritmetica aritmetica1 = new Aritmetica();

        // llamar el metodo
        int resultado = aritmetica1.sumar(5, 3);

        System.out.println("resultado = " + resultado);

    }
}
