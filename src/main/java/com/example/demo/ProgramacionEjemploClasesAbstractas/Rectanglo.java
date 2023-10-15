package com.example.demo.ProgramacionEjemploClasesAbstractas;

public class Rectanglo extends FiguraGeometrica {

    // Inicializar el constructor a partir de la clase padre
    public Rectanglo(String tipoFigura) {
        super(tipoFigura);
    }

    // Sobreescribir metodo abstracto a partir de la clase padre
    @Override
    public void dibujar() {
        // Agregamos el comportamiento del metodo abstracto
        System.out.println("Aqui deberia dibujar: " + this.getClass().getSimpleName());
    }

}
