package com.example.demo.ProgramacionEntradaDatos1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EntradaDatos1 {

    public static void main(String[] args) {

        // variable captura
        String captura;

        // Declarar InputStreamReader
        InputStreamReader input = new InputStreamReader(System.in);

        // Variable de tipo BufferedReader
        BufferedReader brInput = new BufferedReader(input);

        System.out.println("Introduce un dato");

        // Agregar try catch debido a que readLine el metodo puede propargar
        // una excepcion de tipo IOException
        try {
            captura = brInput.readLine();
            System.out.println("Dato introducido: " + captura);
        } catch (IOException ex) {

            ex.printStackTrace(System.out);
        }

    }
}
