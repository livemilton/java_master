package com.example.demo.ProgramacionEjemploVarargs;

public class EjemploVarArgs {

    public static void main(String[] args) {

        // 1 ejemplo Imprimir varios numeros
        imprimirNUmeros(15, 1, 4, 6, 20, 60);

        // 2 ejemplo Parametros variables
        System.out.println("");
        variosParametros("Juan", true, 14, 2, 5);
    }

    private static void variosParametros(String nombre, boolean bandera, int... numeros) {

        System.out.println("nombre = " + nombre);
        System.out.println("bandera = " + bandera);
        // 2 forma iterar con un ciclo foreach
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("elemento = " + numeros[i]);
        }

    }

    private static void imprimirNUmeros(int... numeros) {

        // 1 forma Recorremos cada elementos del arreglo con un ciclo for
        for (int i = 0; i < numeros.length; i++) {

            int elemento = numeros[i];
            System.out.println("elemento = " + elemento);

        }
    }
}
