package com.example.demo.ProgramacionEjemploColeccionesGenericas;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ColeccionesGenericas {
    public static void main(String[] args) {

        // Definir la variable con List y elementos de un tipo String
        List<String> miLista = new ArrayList();
        // se almacenan unicamente tipos String
        miLista.add("Juan");
        miLista.add("Milton");
        miLista.add("Esteban");
        miLista.add("Juan");
        System.out.println("****Impresion ArrayList****");
        // Agregar la lista de objetos string al metodo
        imprimir(miLista);

        // Clase Generica String para Set
        Set<String> miSet = new HashSet();
        miSet.add("100");
        miSet.add("200");
        miSet.add("200");// NO se agrega el valor repetido
        System.out.println("****Impresion HashSet****");
        imprimir(miSet);

        // CLase generica String para Map
        Map<String, String> miMapa = new HashMap();
        miMapa.put("1", "Juan");
        miMapa.put("2", "Karla");
        miMapa.put("3", "Carlos");
        System.out.println("****Impresion HashMap****");
        imprimir(miMapa.keySet());
        imprimir(miMapa.values());
        System.out.println(miMapa.get("1"));

    }

    // Metodo imprimir el cual recibe la coleccion de tipo String e
    // iterar con el ciclo for con el tipo que almacena la coleccion
    private static void imprimir(Collection<String> col) {
        for (String elemento : col) {
            System.out.println("elemento:" + elemento);
        }
        System.out.println("");
    }
}
