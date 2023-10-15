package com.example.demo.ProgramacionEjemploManejoInterfaces;

public interface AccesoDatos {

    // constante
    public static final int MAX_REGISTROS = 10;

    // metodo abstracto define la interface
    // La interface no define el comportamiento
    // La interfaz define la firma del metodo y las clases que implementen a estas
    // interfaces son las
    // responsables de implementar el comportamiento del metodo
    public abstract void insertar();

    public abstract void listar();
}
