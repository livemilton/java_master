package com.example.demo.AlcanceVariables;

public class PruebaCaja {

    public static void main(String[] args) {

        // Definir las variables locales
        int ancho = 3;
        int alto = 2;
        int profundo = 6;

        // Creamos un objeto de la clase Proyecto caja enviando argumentos
        ProyectoCaja volumenCaja = new ProyectoCaja(ancho, alto, profundo);

        // Imprimir los valores de los operandos
        System.out.println("ancho = " + ancho);
        System.out.println("ancho = " + alto);
        System.out.println("ancho = " + profundo);

        // Imprimimos el resultado del calculo del volumen de la caja

        int volumenCajaResultado = volumenCaja.calcularVolumen();
        System.out.println("\nResultado Volumen Caja: " + volumenCajaResultado);

    }
}
