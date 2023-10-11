package com.example.demo.ProgramacionEjemploEnumeraciones;

public enum Continentes {

    AFRICA(53),
    EUROPA(46),
    ASIA(44),
    AMERICA(34),
    OCEANIA(14);

    // Atributo de paises
    private final int paises;

    // Constructor de cada elementos de la enumeración
    Continentes(int paises) {
        this.paises = paises;
    }

    // metodo
    public int getPaises() {
        return this.paises;
    }
}
