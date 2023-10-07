package com.example.demo.EjemploPalabraFinal;

public final class ClaseFinal {
    // variables marcadas como final

    public final int varNumero = 10;

    // constante en Java

    public static final int VAR_PRIMITIVO = 15;

    // constante con objetos

    public static final Persona VAR_PERSONA = new Persona();

    // metodo final, se vera en sobreescritura
    public final void metodoFinal() {

    }

}

// NO es posible crear clases hijas de una clase marcada como final

// class ClaseHija extends ClaseFinal {

// NO es posible modificar el comportamiento (sobreescritura)
// de un metodo padre marcado como final

// public void metodoFinal() {}
// }
