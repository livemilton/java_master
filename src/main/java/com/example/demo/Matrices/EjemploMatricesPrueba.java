package com.example.demo.Matrices;

public class EjemploMatricesPrueba {

    public static void main(String[] args) {

        // 1. Declarar la matriz de tipo int
        int edades[][];
        // 2. Iniciamos la matriz de tipo int
        edades = new int[3][2];

        // 3. Instanciar los valores de la matriz
        edades[0][0] = 30;
        edades[0][1] = 15;
        edades[1][0] = 20;
        edades[1][1] = 45;
        edades[2][0] = 5;
        edades[2][1] = 30;

        // 4. imprimir
        System.out.println("matriz de enteros indice 0 0 :" + edades[0][0]);
        System.out.println("matriz de enteros indice 0 1 :" + edades[0][1]);
        System.out.println("matriz de enteros indice 1 0 :" + edades[1][0]);
        System.out.println("matriz de enteros indice 1 1 :" + edades[1][1]);
        System.out.println("matriz de enteros indice 2 0 :" + edades[2][0]);
        System.out.println("matriz de enteros indice 2 1 :" + edades[2][1]);

        // 1. Declarar e instanciar una matriz de objetos de tipo persona
        Persona personas[][] = new Persona[1][2];

        // 2. Inicializar valores
        personas[0][0] = new Persona("Juan");
        personas[0][1] = new Persona("Karla");

        // 3. Imprimimos los valores
        System.out.println("Matriz persona indice 0 0: " + personas[0][0]);
        System.out.println("Matriz persona indice 0 0: " + personas[0][1]);

        // 4. Ciclo for para recorrer los elementos de la matriz en renglon y columna
        // con dos variables auxiliares

        for (int i = 0; i < personas.length; i++) {
            for (int j = 0; j < personas[i].length; j++) {
                System.out.println("Matriz personas indice: " + i + " - " + j + ": " + personas[i][j]);
            }

        }

    }

}
