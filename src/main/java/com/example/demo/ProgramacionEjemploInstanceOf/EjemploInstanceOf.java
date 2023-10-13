package com.example.demo.ProgramacionEjemploInstanceOf;

public class EjemploInstanceOf {

    public static void main(String[] args) {

        Empleado empleado = new Empleado("Juan", 1000);

        determinarTipo(empleado);

        Gerente gerente = new Gerente("karla", 2000, "Finanzas");
        // determinarTipo(gerente);

    }

    private static void determinarTipo(Empleado empleado) {

        if (empleado instanceof Gerente) {
            Gerente gerente = (Gerente) empleado;
            System.out.println("departamento del gerente: " + gerente.getDepartamento());
            // System.out.println(((Gerente) empleado).getDepartamento());
        } else if (empleado instanceof Empleado) {
            System.out.println("nombre empleado: " + empleado.getNombre());
        }
        if (empleado instanceof Object) {
            System.out.println("object: " + empleado.toString());
        }
    }
}
