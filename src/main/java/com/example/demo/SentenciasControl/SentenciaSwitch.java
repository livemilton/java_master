package com.example.demo.SentenciasControl;

public class SentenciaSwitch {
    public static void main(String[] args) {

        int numero = 3;
        String numeroTexto = "numero desconocido";

        switch (numero) {
            case 1:
                numeroTexto = "numero uno";
                break;

            case 2:
                numeroTexto = "numero dos";
                break;

            case 3:
                numeroTexto = "numero tres";
                break;

            default:
                numeroTexto = "numero desconocido";
        }
        System.out.println("numero texto:" + numeroTexto + " para el numero proporcionado:" + numero);

    }
}
