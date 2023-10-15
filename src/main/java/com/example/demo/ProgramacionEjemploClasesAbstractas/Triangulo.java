package com.example.demo.ProgramacionEjemploClasesAbstractas;

public class Triangulo extends FiguraGeometrica {

    // Inicializar el constructor a partir de la clase padre
    public Triangulo(String tipoFigura) {
        super(tipoFigura);
    }

    // Sobreescribir metodo abstracto a partir de la clase padre
    @Override
    public void dibujar() {
        // Agregaos el comportamiento del metodo abstracto
        System.out.println("Aqui deberia dibujar: " + this.getClass().getSimpleName());
    }
}
