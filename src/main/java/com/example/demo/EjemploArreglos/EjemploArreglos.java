package com.example.demo.EjemploArreglos;

public class EjemploArreglos {
    public static void main(String[] args) {
        // 1. Declaramos una variable de tipo arreglo, un arreglo de int
        int edades[];

        // 2. Instanciamos el arreglo de int
        edades = new int[5];

        // 3. Inicializamos los valores de los elementos del arreglo
        edades[0] = 10;
        edades[1] = 20;
        edades[2] = 30;
        edades[3] = 40;

        // 4. Imprimir los valores del arreglo
        System.out.println("arreglo de enteros de indice 0: " + edades[0]);
        System.out.println("arreglo de enteros de indice 0: " + edades[1]);
        System.out.println("arreglo de enteros de indice 0: " + edades[2]);
        System.out.println("arreglo de enteros de indice 0: " + edades[3]);
        System.out.println("arreglo de enteros de indice 0: " + edades[4]);
        System.out.println("******************");

        // 5. si se pasan los limitos del lenght del arreglo establecido el error es
        // ArrayIndexOutOfBoundsException
        // System.out.println("arreglo de enteros de indice 0: " + edades[5]);

        // 6. Declarar e instanciar un areglo de tipo object
        Persona persona[] = new Persona[5];
        // 7. Inicializar los valores del arreglo de objetos
        persona[0] = new Persona("milton");
        persona[1] = new Persona("Jhon");
        persona[2] = new Persona("esteban");
        persona[3] = new Persona("Karla");
        // persona[5] = new Persona("daniela");

        // 8. Imprimir los valores del arreglo de objetos en la posicion del indice
        System.out.println("Areglo de personas en el indice 0:" + persona[0]);
        System.out.println("Areglo de personas en el indice 1:" + persona[1]);
        System.out.println("Areglo de personas en el indice 2:" + persona[2]);
        System.out.println("Areglo de personas en el indice 3:" + persona[3]);
        System.out.println("Areglo de personas en el indice 4:" + persona[4]);
        // System.out.println("Areglo de personas en el indice 0:" + persona[5]);

        System.out.println("******************");

        // Arreglo utilizando notación simplificada
        String nombres[] = { "milton", "sonia", "stephy", "Karla", "daniel" };

        // Imprimir los valores del arreglo mediante un ciclo for
        for (int i = 0; i < nombres.length; i++) {
            System.out.println("Arreglo string indice: " + i + ":" + nombres[i]);
        }
    }
}
