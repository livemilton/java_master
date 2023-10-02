package com.example.demo.PalabraReturnObject;

public class PalabraReturnClases {

    public static void main(String[] args) {

        // CREAR EL OBJETO S A PARTIR DEL METODO CON LOS VALORES ASIGNADOS
        Suma s = creaObjetoSuma();

        System.out.println("resultado de llamar el metodo sumar: " + s.sumar());

    }

    // OBJETO NUEVA FORMA DE CREAR CON RETURN
    private static Suma creaObjetoSuma() {
        Suma suma = new Suma(4, 6);
        return suma;
    }
}

class Suma {

    // ATRIBUTOS
    int a;
    int b;

    // CONSTRUCTOR VACIO
    public Suma() {

    }

    // CONSTRUCTOR LLENO
    public Suma(int a, int b) {
        this.a = a;
        this.b = b;

    }

    // METODO SUMAR
    public int sumar() {
        return this.a + this.b;

    }
}