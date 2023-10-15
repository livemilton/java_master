package com.example.demo.ProgramacionEjemploClasesAbstractas;

public class EjemploClasesAbstractas {
    public static void main(String[] args) {
        // Creacion de objetos
        // FiguraGeometrica figuraGeometrica = new FiguraGeometrica();

        // Crear un objeto de la clase hija llamando a una variable de la clase padre

        FiguraGeometrica rectangulo = new Rectanglo("Rectangulo");
        System.out.println(rectangulo);

        rectangulo.dibujar();

        FiguraGeometrica circulo = new Circulo("Circulo");
        System.out.println(circulo);
        circulo.dibujar();

        FiguraGeometrica triangulo = new Triangulo("Triangulo");
        System.out.println(triangulo);
        triangulo.dibujar();

    }
}
