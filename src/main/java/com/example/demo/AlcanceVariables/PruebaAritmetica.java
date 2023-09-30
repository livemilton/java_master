package com.example.demo.AlcanceVariables;

public class PruebaAritmetica {

    public static void main(String[] args) {

        // 1 definir las variables locales
        int operandoA = 6;
        int operandoB = 2;

        // 2 Creamos un objeto de la clase Aritmetica enviando argumentos

        Aritmetica objeto1 = new Aritmetica(operandoA, operandoB);

        // 3 Imprimir los valores de los operandos

        System.out.println("operandoA = " + operandoA);
        System.out.println("operandoB = " + operandoB);

        // 4 Imprimimos el resultado de la suma
        int resultadoSuma = objeto1.sumar();
        System.out.println("\nResultado suma: " + resultadoSuma);

        // 5 Imprimimos el resultado de la resta
        int resultadoResta = objeto1.restar();
        System.out.println("\nResultado resta: " + resultadoResta);

        // 6 Imprimos el resultado de la multiplicacion
        int resultadoMultiplicar = objeto1.multiplicar();
        System.out.println("\nResultado multiplicar: " + resultadoMultiplicar);

        // 7 Imprimos el resultado de la division
        int resultadoDividir = objeto1.dividir();
        System.out.println("\nResultado dividir: " + resultadoDividir);

    }

    /*
     * public void otroMetodo(){
     * System.out.println(operandoA);
     * }
     */
}
