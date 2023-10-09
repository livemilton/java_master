package com.example.demo.EjemploJavaDoc;

/**
 * Esta clase permite realizar operaciones de aritmetica como sumar, restar etc
 *
 * @author Milton Muñoz
 * @version 1.0
 */
public class Aritmetica {

    /**
     * Primer operando
     */
    int operandoA;

    /**
     * Segundo operando
     */
    int operandoB;

    /**
     * Constructor vacio de la clase
     */

    public Aritmetica() {

    }

    /**
     *
     * Constructor con dos argumentos
     * 
     * @param operandoA es el primer operando
     * @param operandoB es el segundo operando
     */
    public Aritmetica(int operandoA, int operandoB) {
        this.operandoA = operandoA;
        this.operandoB = operandoB;
    }

    /**
     * Este metodo realiza la suma de dos operandos enteros
     *
     * @return int resultado de la suma
     */
    public int suma() {
        return this.operandoA + this.operandoB;
    }

}
