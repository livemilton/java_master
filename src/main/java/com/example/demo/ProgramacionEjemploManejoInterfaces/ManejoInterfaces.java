package com.example.demo.ProgramacionEjemploManejoInterfaces;

public class ManejoInterfaces {
    public static void main(String[] args) {

        // definir variable acceso datos

        AccesoDatos datos = new ImplementacionOracle();
        datos.insertar();
        datos.listar();

        datos = new ImplementacionMySql();
        datos.insertar();
        datos.listar();

        System.out.println(AccesoDatos.MAX_REGISTROS);
    }
}
