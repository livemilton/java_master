package com.example.demo.ProgramacionManejoExcepcionesJava1;

public class ManejoExcepciones1 {

    public static void main(String[] args) {

        // Insertar en el metodo main throws OperacuibExcecion para que se propague la
        // excepcion
        // public static void main(String[] args) throws OperacionExcepcion
        // nuevo objeto de la clase divisin
        try {
            Division division = new Division(10, 0);
        } catch (OperacionExcepcion ex) {
            // TODO Auto-generated catch block
            System.out.println(ex.getMessage());

            // IMprimir toda la pila de excepcion
            ex.printStackTrace();
        }

        System.out.println("El programa continua");

    }
}
