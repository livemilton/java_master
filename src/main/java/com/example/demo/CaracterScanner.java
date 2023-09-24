package com.example.demo;

import java.util.Scanner;

public class CaracterScanner {
    public static void main(String[] args) {

        // instancia Scanner
        Scanner scanner = new Scanner(System.in);
        System.out.println("Proporciona el valor del usuario: ");
        // pedir al usuario entrada
        String usuario = scanner.nextLine();
        // mostrar resultado
        System.out.println("usuario = " + usuario);
    }
}
