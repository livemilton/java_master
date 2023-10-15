package com.example.demo.ProgramacionEntradaDatos2;

import java.util.Scanner;

public class EntradaDatos {

    public static void main(String[] args) {

        // Varibale captura
        String captura = null;

        // Instanciar Scanner
        Scanner scanner = new Scanner(System.in);
        // Preguntar al usuario
        System.out.println("Introduce un dato: ");

        // Captura el dato con nextLine
        captura = scanner.nextLine();

        // Ciclo para captura continua con while e impresion datos continuos
        while (!"salir".equals(captura)) {
            System.out.println("Dato introducido: " + captura);
            captura = scanner.nextLine();
        }

    }
}
