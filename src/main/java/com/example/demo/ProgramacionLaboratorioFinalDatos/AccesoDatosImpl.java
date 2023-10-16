package com.example.demo.ProgramacionLaboratorioFinalDatos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import com.example.demo.ProgramacionLaboratorioFinalExcepciones.AccesoDatosEx;
import com.example.demo.ProgramacionLaboratorioFinalExcepciones.EscrituraDatosEx;
import com.example.demo.ProgramacionLaboratorioFinalExcepciones.LecturaDatosEx;
import com.example.demo.ProgramacionLaboratorioFinalPeliculas.Pelicula;

public class AccesoDatosImpl implements AccesoDatos {
    // Paso 15 Modificamos el codigo en la clase AccesoDatosImpl
    // Clase que implementa la interface AccesoDatos
    // METODO EXISTE
    @Override
    public boolean existe(String nombreArchivo) throws AccesoDatosEx {
        File archivo = new File(nombreArchivo);
        return archivo.exists();
    }

    // METODO LISTAR
    @Override
    public List<Pelicula> listar(String nombreArchivo) throws LecturaDatosEx {
        File archivo = new File(nombreArchivo);
        List<Pelicula> peliculas = new ArrayList();
        try {
            BufferedReader entrada = new BufferedReader(new FileReader(archivo));
            String linea = null;
            linea = entrada.readLine();
            // ciclo while para leer el texto de las peliculas en el proceso
            while (linea != null) {
                Pelicula pelicula = new Pelicula(linea);
                peliculas.add(pelicula);
                linea = entrada.readLine();
            }
            entrada.close();

        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }
        return peliculas;

    }

    // METODO ESCRIBIR
    @Override
    public void escribir(Pelicula pelicula, String nombreArchivo, boolean anexar) throws EscrituraDatosEx {
        File archivo = new File(nombreArchivo);

        try {
            PrintWriter salida = new PrintWriter(new FileWriter(archivo, anexar));
            salida.println(pelicula.toString());
            salida.close();
            System.out.println("Se ha escrito correctamente el archivo");

        } catch (IOException ex) {

            ex.printStackTrace(System.out);
        }

    }

    // METODO BUSCAR
    @Override
    public String buscar(String nombreArchivo, String buscar) throws LecturaDatosEx {
        File archivo = new File(nombreArchivo);

        String resultado = null;

        BufferedReader entrada;
        try {
            entrada = new BufferedReader(new FileReader(archivo));
            String linea = null;
            int i = 0;
            linea = entrada.readLine();

            // ciclo while para recorrer el archivo
            while (linea != null) {
                if (buscar != null && buscar.equalsIgnoreCase(linea)) {
                    resultado = "Pelicula " + linea + "encontrada en indice " + i;
                    break;
                }
                linea = entrada.readLine();
                i++;
            }
            entrada.close();

        } catch (FileNotFoundException ex) {

            ex.printStackTrace(System.out);
        } catch (IOException ex) {
            ex.printStackTrace(System.out);

        }

        return resultado;
    }

    // METODO CREAR
    @Override
    public void crear(String nombreArchivo) throws AccesoDatosEx {
        File archivo = new File(nombreArchivo);

        try {
            PrintWriter salida = new PrintWriter(new FileWriter(archivo));
            salida.close();
            System.out.println("Se ha creado el archivo correctamente");

        } catch (IOException ex) {

            ex.printStackTrace(System.out);
        }
    }

    // METODO BORRAR
    @Override
    public void borrar(String nombreArchivo) throws AccesoDatosEx {
        File archivo = new File(nombreArchivo);
        archivo.delete();
        System.out.println("se ha borrado el archivo correctamente");

    }

}
