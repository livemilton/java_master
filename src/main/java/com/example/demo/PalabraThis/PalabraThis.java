package com.example.demo.PalabraThis;

public class PalabraThis {
    public static void main(String[] args) {
        // objeto de tipo persona
        Persona persona = new Persona("juan");
    }

}

class Persona {
    // ATRIBUTO CLASE
    String nombre;

    // CONSTRUCTOR
    Persona(String nombre) {
        this.nombre = nombre; // this apunta a un objeto de tipo Persona
        // imprimir
        // this ap a un obj de tipo persona
        System.out.println("impresión del operador this dentro de la clase persona: " + this);

        // llamar metodo imprimir creando un objeto y pasando el metodo con la palabra
        // this
        Imprimir imprimir = new Imprimir();
        imprimir.Imprimir(this);// this contine una referencia al objeto persona
    }

}

class Imprimir {
    // Metodo Imprimir
    public void Imprimir(Persona p) {

        System.out.println("impresion agumento persona: " + p); // imprimir valor del objeto persona
        // this ap a un obj de tipo imprimir en este momento
        System.out.println("impresion objeto actual (this)" + this);

    }
}
