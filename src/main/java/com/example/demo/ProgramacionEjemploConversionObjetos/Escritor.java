package com.example.demo.ProgramacionEjemploConversionObjetos;

public class Escritor extends Empleado {

    // enumeracion
    final TipoEscritura tipoEscritura;

    // sobre escritura del constructor hereado
    public Escritor(String nombre, double sueldo, TipoEscritura tipoEscritura) {
        super(nombre, sueldo);
        this.tipoEscritura = tipoEscritura;

    }

    // metodo sobreescrito del padre
    public String obtenerDetalles() {
        return super.obtenerDetalles() + ", tipoEscritura: " + tipoEscritura.getDescripcion();
    }

    // getter tipo esctritura
    public TipoEscritura getTipoEscritura() {
        return tipoEscritura;
    }

    // getter tipo escritura en texto
    public String getTipoDeEscrituraEnTexto() {
        return tipoEscritura.getDescripcion();
    }

}
