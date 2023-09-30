package com.example.demo.CreacionClasesObjetos;

public class PruebaPersonas {

    public static void main(String[] args) {

        // Creacion de objeto tipo persona

        // instanciar el objeto

        Persona persona1 = new Persona();

        // llamar al metodo
        persona1.desplegarNombre();
        System.out.println("***metodo con data***");

        // acceder al objeto y modificar los valores
        persona1.nombre = "milton";
        persona1.apellido = "muñoz";

        // llamar al metodo con los nombres
        persona1.desplegarNombre();

        // creacion de un segundo objeto de tipo persona
        Persona persona2 = new Persona();
        persona2.nombre = "Aleja";
        persona2.apellido = "Sarmiento";

        System.out.println("***Segundo Objeto***");
        persona2.desplegarNombre();
    }
}
