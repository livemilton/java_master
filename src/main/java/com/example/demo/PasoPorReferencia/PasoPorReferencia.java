package com.example.demo.PasoPorReferencia;

public class PasoPorReferencia {

    public static void main(String[] args) {

        // nuevo objeto
        Persona persona = new Persona();

        // llamar metodo para cambiar nombre
        persona.cambiarNombre("Juan");
        System.out.println("valor nombre: " + persona.obtenerNombre());

        // nuevo metodo
        modificarPersona(persona);

        // imprimir nuevo valor
        System.out.println("valor nombre Modificado: " + persona.obtenerNombre());

        // nuevo metodo 2
        modificarPersonaUltimo(persona);
        System.out.println("valor nombre Modificado de nuevo: " + persona.obtenerNombre());
    }

    // metodo con el paso de la referenciaa persona
    private static void modificarPersona(Persona personaArg) {
        personaArg.cambiarNombre("Carlos");
    }

    // metodo con el paso de la referencia persona
    private static void modificarPersonaUltimo(Persona personaArg2) {
        personaArg2.cambiarNombre("Milton Fabian");
    }

}
