package com.example.demo.Encapsulamiento;

public class PruebaPersona {

    public static void main(String[] args) {

        Persona persona = new Persona("juan", 5000, false);

        // System.out.println("nombre persona: " + persona.getNombre());
        // System.out.println("sueldo persona: " + persona.getSueldo());
        // System.out.println("Persona borrada?: " + persona.isEliminado());

        System.out.println("persona: " + persona.toString());

        persona.setNombre("Carlos");
        persona.setSueldo(3000);
        persona.setEliminado(true);

        // System.out.println("nombre persona: " + persona.getNombre());
        // System.out.println("sueldo persona: " + persona.getSueldo());
        // System.out.println("persona borrada?:" + persona.isEliminado());

        System.out.println("persona: " + persona.toString());

    }
}
