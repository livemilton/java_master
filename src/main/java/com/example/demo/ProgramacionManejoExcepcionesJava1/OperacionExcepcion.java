package com.example.demo.ProgramacionManejoExcepcionesJava1;

public class OperacionExcepcion extends Exception {

    // 1 Extender de la clase Exception

    // 2. Implementar el constructor con el mensaje
    public OperacionExcepcion(String mensaje) {
        super(mensaje);
    }

}
