package com.example.demo.AlcanceVariables;

public class Aritmetica {

    // ATRIBUTOS DE LA CLASE
    int a;
    int b;

    // CONSTRUCTOR VACIO
    public Aritmetica() {
        // Inicializar las variables luego de inicializar el constructor

        System.out.println("Ejecutando constructor Vacio");
    }

    // CONSTRUCTOR CON ARGUMENTOS DE LA CLASE
    // THIS BUENA PRACTICA PARA INDICAR QUE HACEMOS REFERENCIA A UN ARGUMENTO O
    // ATRIBUTO DE LA CLASE Y NO A NIVEL LOCAL
    public Aritmetica(int arg1, int arg2) {
        this.a = arg1;
        this.b = arg2;
        System.out.println("Ejecutando constructor con 2 argumentos");
    }

    // METODO DE LA CLASE
    public int sumar() {

        return this.a + this.b;
    }

    public int restar() {
        return this.a - this.b;
    }

    public int multiplicar() {
        return this.a * this.b;
    }

    public int dividir() {
        return this.a / this.b;
    }
}
