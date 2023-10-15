package com.example.demo.ProgramacionEjemploManejoInterfaces;

public class ImplementacionMySql implements AccesoDatos {

    @Override
    public void insertar() {
        System.out.println("Insertar desde MySql");
    }

    @Override
    public void listar() {
        System.out.println("listar desde MySql");
    }

}
