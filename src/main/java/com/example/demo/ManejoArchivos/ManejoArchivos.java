package com.example.demo.ManejoArchivos;

import static com.example.demo.ManejoArchivos.Archivos.crearArchivo;
import static com.example.demo.ManejoArchivos.Archivos.escribirArchivo;
import static com.example.demo.ManejoArchivos.Archivos.leerArchivo;
import static com.example.demo.ManejoArchivos.Archivos.anexarArchivo;

public class ManejoArchivos {

    public static void main(String[] args) {

        // crear la ruta para guardar el archivo
        String nombreArchivo = "c:\\Users\\MIMUNOZ\\Documents\\java_course\\pruebaJava\\archivoPruebaJava.txt";

        // crear el archivo

        // crearArchivo(nombreArchivo);

        // Escribir al archivo

        // escribirArchivo(nombreArchivo);

        // Leer informacion del archivo

        // leerArchivo(nombreArchivo);

        // Anexamos informacion al archivo
        anexarArchivo(nombreArchivo);

        // Leer informacion del archivo

        leerArchivo(nombreArchivo);
    }

}
