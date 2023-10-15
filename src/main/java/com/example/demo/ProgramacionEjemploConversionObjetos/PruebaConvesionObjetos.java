package com.example.demo.ProgramacionEjemploConversionObjetos;

public class PruebaConvesionObjetos {

    public static void main(String[] args) {

        // Objeto
        Empleado empleado;

        // asignar objeto empleado a Escritor y pasar argumentos
        empleado = new Escritor("Roy", 5000, TipoEscritura.CLASICO);
        // empleado.getTipoDeEscrituraEnTexto();

        // POlimorfismo del metodo ya que apunta a la referencia del metodo obtener
        // detalles en escritor
        // y no en el metodo obtener detalles del empleado
        System.out.println(empleado.obtenerDetalles());

        // casting objetos y se accede al metodo de la clase empleado
        Escritor escritor = (Escritor) empleado;
        System.out.println(escritor.getTipoDeEscrituraEnTexto());

        // casting 2 forma sin asignar la variable sino directamente
        System.out.println(((Escritor) empleado).getTipoDeEscrituraEnTexto());

        // Comprobacion de casting con otra clase hija
        empleado = new Gerente("Laura", 6000, "Sistemas");
        System.out.println(((Gerente) empleado).getDepartamento());
        ;
    }
}
