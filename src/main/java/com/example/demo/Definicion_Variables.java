package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Definicion_Variables {

	public static void main(String[] args) {

		// variable saludar
		String saludar = "saludos desde java";

		System.out.println(saludar);
		System.out.println(saludar);
		System.out.println(saludar);

		// variable despedirse con var java 11
		var despedirse = "hasta luego";
		System.out.println(despedirse);

		// variable numero con var java 11
		var numero = 1;
		System.out.println(numero);
	}

}
