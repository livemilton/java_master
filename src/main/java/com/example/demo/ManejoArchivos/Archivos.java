package com.example.demo.ManejoArchivos;

import java.io.*;

public class Archivos {

    // metodos para realizar la operacion sobre un archivo
    public static void crearArchivo(String nombreArchivo) {

        File archivo = new File(nombreArchivo);

        try {
            // Objeto printwriter y se le pasa al constructor el archivo que se va a crear
            PrintWriter salida = new PrintWriter(archivo);
            salida.close();
            System.out.println("El archivo se ha creado correctamente");
        } catch (FileNotFoundException ex) {

            ex.printStackTrace(System.out);
        }
    }

    public static void escribirArchivo(String nombreArchivo) {

        File archivo = new File(nombreArchivo);

        try {
            PrintWriter salida = new PrintWriter(archivo);
            // Contenido a escribir
            String contenido = "Contenido a escribir en el archivo";
            salida.println(contenido);
            salida.println();
            salida.println("Fin escritura");
            salida.close();
            System.out.println("Se ha escrito correctamente al archivo");

        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        }
    }

    public static void leerArchivo(String nombreArchivo) {
        File archivo = new File(nombreArchivo);

        try {
            // Nuevo objeto para leer lineas completas
            BufferedReader entrada = new BufferedReader(new FileReader(archivo));
            // varable para leer lineas completas
            String lectura = entrada.readLine();

            // leer toda la informacion del archivo con un ciclo while
            while (lectura != null) {
                System.out.println(lectura);
                lectura = entrada.readLine();
            }
            entrada.close();

        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);

        } catch (IOException ex) {
            ex.printStackTrace(System.out);

        }

    }

    public static void anexarArchivo(String nombreArchivo) {

        File archivo = new File(nombreArchivo);

        try {

            PrintWriter salida = new PrintWriter(new FileWriter(archivo, true));
            // Flujo para anexar informacion

            String contenido = "Anexando informacion al archivo";
            salida.println(contenido);
            salida.println();
            salida.println("Fin anexar");
            salida.close();
            System.out.println("Se ha anexado la informacion al archivo");

        } catch (FileNotFoundException ex) {

            ex.printStackTrace(System.out);
        } catch (IOException ex) {

            ex.printStackTrace();
        }
    }

}
