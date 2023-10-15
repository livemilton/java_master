package com.example.demo.ProgramacionEntradaDatosCalculadora;

import java.util.Scanner;
import static com.example.demo.ProgramacionEntradaDatosCalculadora.Operaciones.*;

public class Calculadora {

    public static void main(String[] args) {

        System.out.println("Proporciona el primer valor");

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        System.out.println("Proporciona el segundo valor");
        int b = scanner.nextInt();

        int resultadoSuma = sumar(a, b);
        int resultadoResta = restar(a, b);
        int resultadoMultiplicacion = multiplicar(a, b);
        int resultadoDivision = dividir(a, b);

        System.out.println("El resultado de la suma es: " + resultadoSuma);
        System.out.println("El resultado de la resta es: " + resultadoResta);
        System.out.println("El resultado de la multiplicacion es: " + resultadoMultiplicacion);
        System.out.println("El resultado de la division es: " + resultadoDivision);
    }
}
