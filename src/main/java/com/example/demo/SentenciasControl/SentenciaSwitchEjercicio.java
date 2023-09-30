package com.example.demo.SentenciasControl;

import java.util.Scanner;

public class SentenciaSwitchEjercicio {
    public static void main(String[] args) {

        var scanner = new Scanner(System.in);
        System.out.println("Por favor ingrese un numero del 1 al 12 para el mes del año");
        int mes = scanner.nextInt();
        String estacion = null;

        switch (mes) {
            case 1:
            case 2:
            case 12:
                estacion = "Invierno";
                break;

            case 3:
            case 4:
            case 5:
                estacion = "Primavera";
                break;

            case 6:
            case 7:
            case 8:
                estacion = "Verano";

            case 9:
            case 10:
            case 11:
                estacion = "Otoño";

            default:
                estacion = "Mes incorrecto";
        }
        System.out.println("estacion : " + estacion + " para el mes: " + mes);

    }
}
