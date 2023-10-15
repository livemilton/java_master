package com.example.demo.ProgramacionEjercicioClaseObject;

import org.openjdk.jol.info.GraphLayout;
import org.openjdk.jol.vm.VM;

public class ClaseObject {

    public static void main(String[] args) {
        // Objetos
        // Imprimirlos
        Empleado emp1 = new Empleado("Juan", 10000);
        System.out.println("emp1 = " + emp1);
        Empleado emp2 = new Empleado("Juan", 10000);
        System.out.println("emp2 = " + emp2);

        // Comprobar si los objetos son los mismos con la direccion en memoria
        System.out.println("Objetos iguales: " + (emp1 == emp2));

        // metodo comparar objetos
        compararObjetos(emp1, emp2);

        /*
         * // Comprobar la direccion en memoria con la libreria descargada para cada
         * // empleado, ignorar el warning en consola
         *
         * System.out.println("direccion memoria emp1" + VM.current().addressOf(emp1));
         * System.out.println("direccion memoria emp2" + VM.current().addressOf(emp2));
         *
         * // mas detalle de los objetos
         *
         * System.out.println("Detalle emp1: " +
         * GraphLayout.parseInstance(emp1).toPrintable());
         * System.out.println("Detalle emp1: " +
         * GraphLayout.parseInstance(emp2).toPrintable());
         */
    }

    private static void compararObjetos(Empleado emp1, Empleado emp2) {
        System.out.println("emp1 = " + emp1);
        System.out.println("emp2 = " + emp2);

        // Revision por referencia

        if (emp1 == emp2) {
            System.out.println("Los objetos tienen la misma direcicon en memoria");
        } else {
            System.out.println("Los objetos tienen distinta posicion en memoria");
        }

        // Revision del metodo equals

        if (emp1.equals(emp2)) {
            System.out.println("Los objetos tienen el mismo contenido");
        } else {
            System.out.println("Los objetos NO tienen el mismo contenido");
        }

        // Revision del metodo hascode
        if (emp1.hashCode() == emp2.hashCode()) {
            System.out.println("Los objetos tienen el mismo codigo hash");
            System.out.println("emp1= " + emp1.hashCode());
            System.out.println("emp2= " + emp2.hashCode());
        } else {
            System.out.println("Los objetos NO tienen el mismo codigo hash");
        }

    }

}
