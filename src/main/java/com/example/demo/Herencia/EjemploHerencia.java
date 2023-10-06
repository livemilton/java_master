package com.example.demo.Herencia;

import java.util.Date;

public class EjemploHerencia {

    public static void main(String[] args) {

        // OBJETO EMPLEADO
        Empleado empleado1 = new Empleado("juan", 5000);
        empleado1.setEdad(28);
        empleado1.setGenero('M');
        empleado1.setDireccion("Lomas #13");
        System.out.println(empleado1);

        Cliente cliente1 = new Cliente(new Date(), true);
        cliente1.setNombre("Karla");
        cliente1.setEdad(25);
        cliente1.setGenero('F');
        cliente1.setDireccion("Roma 12");
        System.out.println(cliente1);

    }

}
