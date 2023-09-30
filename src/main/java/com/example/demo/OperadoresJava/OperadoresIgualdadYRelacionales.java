package com.example.demo.OperadoresJava;

public class OperadoresIgualdadYRelacionales {
    public static void main(String[] args) {
        System.out.println("*****OPERADORES IGUALDAD*******");
        /* Operadores de igualdad y diferente de */
        int a = 3, b = 2;

        boolean c = (a == b);
        System.out.println("c =" + c);

        c = (a != b);
        System.out.println("c = " + c);

        System.out.println("*****OPERADORES IGUALDAD OBJECTS*******");
        /* Para igualdad en object no se usa == sino equals */

        String cadena = "hola";
        String cadena2 = "hola";
        System.out.println(cadena.equals(cadena2));

        System.out.println("*****OPERADORES RELACIONALES*******");
        /* Operadores relacionales >, <, >=, <= */
        boolean d = a <= b;
        System.out.println("d = " + d);

        System.out.println("*****OPERADORES EJERCICIOS IGUALDAD*******");
        /* EJERCICIO OPERADOR IGUALDAD */
        if (b % 2 == 0) {
            System.out.println("numero par");

        } else {
            System.out.println(" numero impar");
        }

        System.out.println("*****OPERADORES EJERCICIOS RELACIONAL*******");
        /* EJERCICIO 2 OPERADOR RELACIONAL */
        int edad = 31;
        int adulto = 18;
        if (edad >= adulto) {
            System.out.println("es un adulto");
        } else {
            System.out.println("es menor de edad");
        }

    }
}
