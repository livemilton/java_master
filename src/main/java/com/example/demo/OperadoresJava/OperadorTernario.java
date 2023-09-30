package com.example.demo.OperadoresJava;

public class OperadorTernario {
    public static void main(String[] args) {

        System.out.println("*****OPERADOR TERNARIO*******");
        System.out.println("Expresion a evaluar | valor si es verdadero | valor si es falso");

        boolean resultado = (1 > 2) ? true : false;
        System.out.println("resultado = " + resultado);

        var resultado1 = (1 > 2) ? "verdadero" : "falso";
        System.out.println("resultado = " + resultado1);

        var numero = 8;
        var par = (numero % 2 == 0) ? "numero par" : "numero impar";
        System.out.println("par = " + par);

    }

}
