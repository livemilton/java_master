package com.example.demo.ProgramacionEjemploManejoInterfaces;

public class ImplementacionOracle implements AccesoDatos {

    // implementacion de los metodos abstractos definidos en la interface

    @Override
    public void insertar() {
        System.out.println("Insertar desde Oracle");

    }

    @Override
    public void listar() {

        System.out.println("Listar desde Oracle");
    }

}
