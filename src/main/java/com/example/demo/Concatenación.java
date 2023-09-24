package com.example.demo;

public class Concatenación {

    public static void main(String[] args) {

        // CONCATENACION
        String usuario = "Juan";
        String saludar = "Hola";

        System.out.println(saludar + " " + usuario);

        // CONCATENACION NUMEROS
        int i = 3;
        int j = 5;
        System.out.println(i + j);

        // CONCATENACIÓN CON STRING Y NUMERO--CONTEXTO STRING DE CADENA (PRIMERO
        // ENCUENTRA CADENA ENTONCES CONCATENA)
        System.out.println(saludar + i + j);

        // CONCATENACIÓN CON NUMERO Y STRING (PRIMERO ENCUENTRA NUMEROS SUMA Y
        // CONCATENA)
        System.out.println(i + j + saludar);
    }
}
