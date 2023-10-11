package com.example.demo.ProgramacionEjemploEnumeraciones;

public class EjemploEnumeraciones {

    public static void main(String[] args) {

        // Valores de la enumeracion imprimir
        System.out.println("Valor 1: " + Dias.LUNES);
        System.out.println("Valor 2: " + Dias.MARTES);

        // Utilizamos la enumeracion de paises
        System.out.println("Continente no.4: " + Continentes.AMERICA);
        System.out.println("Accedemos al numero de paises del continente 4: " + Continentes.AMERICA.getPaises());

        // Utilizamos la enumeracion de paises para otro ejemplo
        System.out.println("Accedemos al continente 1: " + Continentes.AFRICA);
        System.out.println("No. de paises del continente 1: " + Continentes.AFRICA.getPaises());

        // Utilizando metodo con switch case con funcion
        indicarDia(Dias.MIERCOLES);
    }

    // metodo indicar dia
    private static void indicarDia(Dias dias) {
        switch (dias) {
            case LUNES:
                System.out.println("Primer dia de la semana");
                break;
            case MARTES:
                System.out.println("Segundo dia de la semana");
                break;
            case MIERCOLES:
                System.out.println("Tercer dia de la semana");
                break;
            case JUEVES:
                System.out.println("Cuarto dia de la semana");
                break;
            case VIERNES:
                System.out.println("Quinto dia de la semana");
                break;
            case SABADO:
                System.out.println("Sexto dia de la semana");
                break;

            case DOMINGO:
                System.out.println("Septimo dia de la semana");
                break;

        }
    }

}
