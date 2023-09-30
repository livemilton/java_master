package com.example.demo.AlcanceVariables;

public class ProyectoCaja {

    // ATRIBUTOS DE LA CLASE
    int ancho;
    int alto;
    int profundo;

    // CONSTRUCTOR VACIO
    public ProyectoCaja() {
        System.out.println("Iniciando constructor vacio");
    }

    // CONSTRUCTOR CON ARGUMENTOS

    public ProyectoCaja(int arg1, int arg2, int arg3) {

        this.ancho = arg1;
        this.alto = arg2;
        this.profundo = arg3;
        System.out.println("Iniciando constructor con 3 argumentos");

    }

    // METODO PARA CALCULAR EL VOLUMEN DE LA CAJA

    public int calcularVolumen() {
        return ancho * alto * profundo;
    }

}
