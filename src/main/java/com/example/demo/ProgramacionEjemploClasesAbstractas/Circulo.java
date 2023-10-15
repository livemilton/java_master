package com.example.demo.ProgramacionEjemploClasesAbstractas;

public class Circulo extends FiguraGeometrica {

    // COnstructor inicializado de la clase padre

    public Circulo(String tipoFigura) {
        super(tipoFigura);
    }

    @Override
    public void dibujar() {
        // Agregamos el comportamiento del metodo abstracto GetClass para imprimir el
        // nombre de la clase
        System.out.println("Aqui deberia dibujar: " + this.getClass().getSimpleName());
        // super.dibujar();
    }

}
