package com.example.demo.Ciclos;

public class CicloConBreakYContinue {

    public static void main(String[] args) {

        System.out.println("*****CICLO FOR CON BREAK********");
        // etiqueta no recomendable a excepcion de ciclos anidados
        inicio: for (int i = 0; i < 3; i++) {
            // imprimir solo numeros pares y el primero ciclo break rompe con la ejecucion
            // del ciclo for
            if (i % 2 == 0) {
                System.out.println("i= " + i);
                break inicio;
            }

        }
        System.out.println("*****CICLO FOR CON CONTINUE********");
        // etiqueta no recomendable a excepcion de ciclos anidados
        // continue
        inicio: for (int j = 0; j < 3; j++) {
            // imprimir solo numeros pares //continue solo continua con la siguiente
            // iteración del ciclo for, no rompe la ejecucion
            // en este ejemplo se imprime 0 y 2
            if (j % 2 != 0) {
                continue inicio;
            }
            System.out.println("i= " + j);

        }

    }

}
