package com.example.demo.ProgramacionLaboratorioFinalExcepciones;

public class AccesoDatosEx extends Exception {
    // Paso 11 Modificamos el codigo en la clase AccesoDatosEX
    // Clase extiende de la clase padre EXCEPTION

    // Atributo de la clase excepcion accesodatos
    String mensaje;

    // Constructor de la clase con un argumento para la excepcion
    public AccesoDatosEx(String mensaje) {
        this.mensaje = mensaje;
    }
}
