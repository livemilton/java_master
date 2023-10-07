package com.example.demo.EjemploPalabraFinal;

public class EjemploPalabraFinal {

    public static void main(String[] args) {

        // Modificar un atributo final
        // ClaseFinal.VAR_PRIMITIVO = 20;

        // Modificar la reerencia de un atributo de tipo Object
        // ClaseFinal.VAR_PERSONA = new Persona();

        ClaseFinal.VAR_PERSONA.setNombre("Juan");
        System.out.println(ClaseFinal.VAR_PERSONA.getNombre());

        ClaseFinal.VAR_PERSONA.setNombre("Carlos");
        System.out.println(ClaseFinal.VAR_PERSONA.getNombre());
    }
}
