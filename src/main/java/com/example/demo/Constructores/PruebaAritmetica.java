package com.example.demo.Constructores;

public class PruebaAritmetica {

    public static void main(String[] args) {

        // Crear el objeto de tipo aritmetica
        Aritmetica aritmetica1 = new Aritmetica();
        // Asignar valores a las variables dentro luego de la instancia, desde la
        // varible arimetica1 que apunta al objeto Aritmetica
        aritmetica1.a = 10;
        aritmetica1.b = 3;
        // llamar el metodo
        int resultado = aritmetica1.sumar();

        System.out.println("resultado = " + resultado);

        // Creacion del 2 objeto llamado aritmetica 2
        Aritmetica aritmetica2 = new Aritmetica(4, 2);

        System.out.println("resultado2 = " + aritmetica2.sumar());
    }

}
