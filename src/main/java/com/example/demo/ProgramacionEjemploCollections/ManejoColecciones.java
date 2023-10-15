package com.example.demo.ProgramacionEjemploCollections;

import java.util.*;

public class ManejoColecciones {

    public static void main(String[] args) {

        // Variable de tipo lista Con la interface List y el objeto new ArrayList
        List miLista = new ArrayList();
        miLista.add(1);
        miLista.add(2);
        miLista.add(3);

        // Elemento repetido si se agrega
        miLista.add(3);

        // Llamar al metodo imprimir
        System.out.println("****Impresion ArrayList****");
        imprimir(miLista);

        // Variable de tipo set con la interface Set y el objeto HashSet

        Set miSet = new HashSet();
        miSet.add("100");
        miSet.add("200");
        miSet.add("300");
        // Elemento duplicado no se agrega
        miSet.add("300");
        System.out.println("****Impresion HashSet****");
        imprimir(miSet);

        // Variable de tipo interface Map y el objeto HashMap
        // llave, valor
        Map miMapa = new HashMap();
        miMapa.put("valor1", "Juan");
        miMapa.put("valor2", "karla");
        miMapa.put("valor3", "Carlos");
        // elemento duplicado, sustituye al valor agregado previamente
        miMapa.put("valor3", "Rosario");
        // imprimimos las llaves con el metodo keySet()
        System.out.println("****Impresion HashMap****");
        imprimir(miMapa.keySet());
        // imprimir los valores
        imprimir(miMapa.values());

        // extraer valor asociado a una llave
        System.out.println(miMapa.get("valor3"));
    }

    private static void imprimir(Collection coleccion) {
        for (Object elemento : coleccion) {
            System.out.println("elemento: " + elemento);
        }

        System.out.println("");
    }

}
