package com.example.demo.ProgramacionManejoGenericos;

public class ManejoGenericosTest {
    public static void main(String[] args) {

        ClaseGenerica<Integer> objetoInt = new ClaseGenerica(15);
        objetoInt.obtenerTipo();

        ClaseGenerica<String> objetoString = new ClaseGenerica("Prueba");
        objetoString.obtenerTipo();

        // La clase generica no permite tipos primitivos en clases genericas
        // ClaseGenerica<int> objetoPrimitivo = new ClaseGenerica(1);
    }
}
