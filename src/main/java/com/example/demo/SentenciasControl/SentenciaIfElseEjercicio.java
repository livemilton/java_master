package com.example.demo.SentenciasControl;

import java.util.Scanner;

public class SentenciaIfElseEjercicio {

    public static void main(String[] args) {

        var scanner = new Scanner(System.in);
        System.out.println("Por favor ingrese un numero del 1 al 12 para el mes del año");
        int mes = scanner.nextInt(); // mes del año

        String estacion = null;// estacion del año

        // sentencia if else
        if (mes == 1 || mes == 2 || mes == 12) {
            estacion = "Invierno";
        } else if (mes == 3 || mes == 4 || mes == 5) {
            estacion = "Primavera";
        } else if (mes == 6 || mes == 7 || mes == 8) {
            estacion = "Verano";
        } else if (mes == 9 || mes == 10 || mes == 11) {
            estacion = "Otoño";
        } else {
            estacion = "Mes incorrecto";
        }
        System.out.println("estacion:" + estacion + " para el mes: " + mes);
    }

}
