package com.example.demo.ProgramacionLaboratorioFinalNegocio;

import java.util.List;

import com.example.demo.ProgramacionLaboratorioFinalDatos.AccesoDatos;
import com.example.demo.ProgramacionLaboratorioFinalDatos.AccesoDatosImpl;
import com.example.demo.ProgramacionLaboratorioFinalExcepciones.AccesoDatosEx;
import com.example.demo.ProgramacionLaboratorioFinalExcepciones.LecturaDatosEx;
import com.example.demo.ProgramacionLaboratorioFinalPeliculas.Pelicula;

/**
 * Admnistrador del catalogo de pelculas
 *
 * @author Ing. Milton Muñoz
 */
public class CatalogoPeliculasImpl implements CatalogoPeliculas {

    // Paso 17 Modificamos el codigo en la clase CatalogoPeliculasImpl
    // atributos de la clase
    private final AccesoDatos datos;

    // constructor de la clase
    public CatalogoPeliculasImpl() {
        this.datos = new AccesoDatosImpl();
    }

    // METODO AGREGAR PELICULA
    @Override
    public void agregarPelicula(String nombrePelicula, String nombreArchivo) {
        Pelicula pelicula = new Pelicula(nombrePelicula);
        boolean anexar = false;

        try {
            anexar = datos.existe(nombreArchivo);
            datos.escribir(pelicula, nombreArchivo, anexar);
        } catch (AccesoDatosEx ex) {
            System.out.println("Error de acceso a datos");
            ex.printStackTrace();
        }

    }

    // METODO AGREGAR LISTAR PELICULAS
    @Override
    public void listarPeliculas(String nombreArchivo) {

        try {
            List<Pelicula> peliculas = datos.listar(nombreArchivo);
            for (Pelicula pelicula : peliculas) {
                System.out.println("Pelicula: " + pelicula);
            }

        } catch (LecturaDatosEx ex) {
            System.out.println("Error de acceso a datos");
            ex.printStackTrace(System.out);
        }
    }

    // METODO BUSCAR PELICULA
    @Override
    public void buscarPelicula(String nombreArchivo, String buscar) {
        String resultado = null;
        try {
            resultado = datos.buscar(nombreArchivo, buscar);

        } catch (LecturaDatosEx ex) {
            System.out.println("Error al buscar pelicula");
            ex.printStackTrace();
        }
        System.out.println("Resultado busqueda: " + resultado);

    }

    // METODO INICIAR ARCHIVO
    @Override
    public void iniciarArchivo(String nombreArchivo) {

        try {
            if (datos.existe(nombreArchivo)) {
                datos.borrar(nombreArchivo);
                datos.crear(nombreArchivo);
            } else {
                // creamos archivo
                datos.crear(nombreArchivo);
            }
        } catch (AccesoDatosEx ex) {
            System.out.println("Error de acceso a datos");
            ex.printStackTrace();
        }
    }

}
