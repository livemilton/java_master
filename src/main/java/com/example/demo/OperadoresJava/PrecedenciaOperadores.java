package com.example.demo.OperadoresJava;

public class PrecedenciaOperadores {
    public static void main(String[] args) {

        System.out.println("**primero se evalua el operador unario y luego la suma");
        int x = 5;
        int y = 10;
        int z = ++x + y--; // x=6, y=10, z=16

        System.out.println("x= " + x);
        System.out.println("y = " + y);
        System.out.println("z= " + z);

        System.out.println("\nEjemplo 2 Precedencia de operadores");

        var resultado = 4 + 5 * 6 / 3;// 4 + ((5*6)/3) => 4 +(30/3) => 4 + 10 => 14
        System.out.println("resultado = " + resultado);

        System.out.println("\nEjemplo 3 Precedencia de operadores");
        resultado = (4 + 5) * 6 / 3; // Prioridad operadores unarios, parentesis, suma ..etc
        System.out.println("resultado = " + resultado);

    }
}
