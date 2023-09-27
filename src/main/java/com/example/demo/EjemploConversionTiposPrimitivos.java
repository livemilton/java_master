package com.example.demo;

import java.util.Scanner;

public class EjemploConversionTiposPrimitivos {

    public static void main(String[] args) {

        // convertir un String a un tipo int
        int edad = Integer.parseInt("20");
        System.out.println("edad = " + edad);

        // convertir string a double
        double valorPI = Double.parseDouble("3.1416");
        System.out.println("valorPI = " + valorPI);

        // char a string a chart -- seleccionar una cadena a un char
        char c = "hola".charAt(0);
        System.out.println("c = " + c);

        // conversion de esctritura en consola a codigo int
        var scanner = new Scanner(System.in);
        edad = Integer.parseInt(scanner.nextLine());
        System.out.println("edad = " + edad);

        char caracter = scanner.nextLine().charAt(0);
        System.out.println("caracter = " + caracter);

        // tipo entero a tipo string
        String edadTexto = String.valueOf(25);
        System.out.println("edadTexto = " + edadTexto);

        // conversion o casting entre tipos
        short s = 129;
        byte b = (byte) s;
        System.out.println("b = " + b);

    }
}
