package com.example.demo.TiposPrimitivos;

public class TiposPrimitivosFloatDouble {
    public static void main(String[] args) {

        var floatVar = 1000.10F;
        System.out.println("floatVar=" + floatVar);

        System.out.println("bits tipo float: " + Float.SIZE);
        System.out.println("bytes tipo float: " + Float.BYTES);
        System.out.println("Valor minimo tipo float: " + Float.MIN_VALUE);
        System.out.println("Valor maximo tipo float: " + Float.MAX_VALUE);

        double doubleVar = 100.10;
        System.out.println("doubleVar = " + doubleVar);

        System.out.println("bits tipo float: " + Double.SIZE);
        System.out.println("bytes tipo float: " + Double.BYTES);
        System.out.println("Valor minimo tipo float: " + Double.MIN_VALUE);
        System.out.println("Valor maximo tipo float: " + Double.MAX_VALUE);
    }
}
