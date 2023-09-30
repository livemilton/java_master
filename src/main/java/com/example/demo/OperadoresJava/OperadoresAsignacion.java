package com.example.demo.OperadoresJava;

public class OperadoresAsignacion {
    public static void main(String[] args) {

        /* asignación de operadores */
        int a = 3, b = 2, d = 5, e = 10, f = 20;

        int c = a + 5 - b;
        System.out.println("*******OPERADOR ASIGNACION********");
        System.out.println("c = " + c);

        /* operadores de composición */
        System.out.println("*******OPERADOR COMPOSICION a += ********");
        a += 1; // a=a+1
        System.out.println("a = " + a);

        a += 3;// a=a+3
        System.out.println("a = " + a);

        System.out.println("*******OPERADOR COMPOSICION a -= ********");
        b -= 1; // b=b-1
        System.out.println("b = " + b);

        System.out.println("*******OPERADOR COMPOSICION a *= ********");
        d *= 2; // c=c*2
        System.out.println("d = " + d);
        System.out.println("*******OPERADOR COMPOSICION a /= ********");
        e /= 2; // d=d/2
        System.out.println("e = " + e);
        System.out.println("*******OPERADOR COMPOSICION a %= ********");
        f %= 2; // e=e%2
        System.out.println("f = " + f);

        System.out.println("*******OPERADOR UNARIOS ********");

        int m = 3;
        int n = -m;
        System.out.println("n= " + n);

        boolean o = true;
        boolean p = !o;

        System.out.println(" o =" + p);

        /* INCREMENTO Y DECREMENTO */

        System.out.println("*******PREINCREMENTO ********");
        // primero se incrementa el valor de la variable y se asigna el resultado
        int q = 3;
        int r = ++q;
        System.out.println("q= " + q);
        System.out.println("r=" + r);
        System.out.println("*******POSTINCREMENTO ********");
        // POSTINCREMENTO
        // primero se asigna el valor de la variable sin incrementarla, se le asigna el
        // valor a la variable
        // la siguiente vez que se utilice la variable es que se incrementa
        int g = 5;
        int h = g++;
        System.out.println("g= " + g);
        System.out.println("h= " + h);

        System.out.println("*******PREDECREMENTO ********");
        int v = 2;
        int w = --v;
        System.out.println("v = " + v);
        System.out.println("w =" + w);

        System.out.println("*******POSTDECREMENTO ********");

        int x = 4;
        int y = x--;
        System.out.println("x= " + x);
        System.out.println("y= " + y);
    }

}
