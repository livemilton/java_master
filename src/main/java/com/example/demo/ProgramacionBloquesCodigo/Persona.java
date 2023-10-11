package com.example.demo.ProgramacionBloquesCodigo;

public class Persona {

    // Atributos clase
    private final int idPersona;
    private static int contadorPersonas;

    // Bloque de inicializacion de codigo static
    static {
        contadorPersonas = 10;
        // NO podemos utilizar variables no estaticas dentro del bloque static
        // idPersona = 2;
        System.out.println("Ejecución de bloque estatico");
    }

    // Bloque NO estatico se copia a cada objeto
    {
        System.out.println("Ejecución bloque NO estatico");
        this.idPersona = ++contadorPersonas;

    }

    // constructor
    public Persona() {
        System.out.println("Ejecución del constructor");
    }

    // metodo getter
    public int getIdPersona() {
        return this.idPersona;
    }

}
