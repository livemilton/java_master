package com.example.demo.ProgramacionManejoExcepcionesJava1;

public class Division {

    // Atributos de la clase
    private int numerador;
    private int denominador;

    // constructor con la firma y que posiblemente lance una excepcion asi mismo
    // inicializar los atributos
    public Division(int numerador, int denominador) throws OperacionExcepcion {

        // crear un objeto de tipo OperacionExcepcion con el mensaje y la validacion
        // respectiva

        if (this.denominador == 0) {
            throw new OperacionExcepcion("Denominador igual a cero");
        }

        //
        this.numerador = numerador;
        this.denominador = denominador;

    }

    // metodo para visualizar que no devuelve nada
    public void visualizarOperacion() {
        System.out.println("El resultado de la division es: " + this.numerador / this.denominador);
    }
}
