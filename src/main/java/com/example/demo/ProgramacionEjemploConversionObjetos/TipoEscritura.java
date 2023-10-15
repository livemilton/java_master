package com.example.demo.ProgramacionEjemploConversionObjetos;

public enum TipoEscritura {

    // Tipos de enumerados de enum TipoEscrtura
    CLASICO("Escritura a Mano"),
    MODERNO("Escritura Digital");

    // Atributo de la clase enum
    private final String descripcion;

    // Constructor de la clase enum
    private TipoEscritura(String descripcion) {
        this.descripcion = descripcion;
    }

    // metodo getter de la clase enum
    public String getDescripcion() {
        return this.descripcion;
    }

}
