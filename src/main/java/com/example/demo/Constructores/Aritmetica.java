package com.example.demo.Constructores;

public class Aritmetica {

    // ATRIBUTOS DE LA CLASE
    int a;
    int b;

    // SI EXISTE UN CONSTRUCTOR CON ARGUMENTOS SE DEBE INCLUIR EL CONSTRUCTOR VACIO
    // OBLIGATORIO EN JAVA

    // CONSTRUCTOR VACIO
    public Aritmetica() {
        // Inicializar las variables luego de inicializar el constructor
        // a = 5;
        // b = 3;
        System.out.println("Ejecutando constructor Vacio");
    }

    // CONSTRUCTOR CON ARGUMENTOS DE LA CLASE
    public Aritmetica(int arg1, int arg2) {
        a = arg1;
        b = arg2;
        System.out.println("Ejecutando constructor con 2 argumentos");
    }

    // METODO DE LA CLASE SUMAR
    public int sumar() {

        int resultado = a + b; // SE UTILIZAN LOS ATRIBUTOS DE LA CLASE

        return resultado;
    }
}
