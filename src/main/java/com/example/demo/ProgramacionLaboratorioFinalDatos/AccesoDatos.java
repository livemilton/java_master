package com.example.demo.ProgramacionLaboratorioFinalDatos;

import java.util.List;

import com.example.demo.ProgramacionLaboratorioFinalExcepciones.AccesoDatosEx;
import com.example.demo.ProgramacionLaboratorioFinalExcepciones.EscrituraDatosEx;
import com.example.demo.ProgramacionLaboratorioFinalExcepciones.LecturaDatosEx;
import com.example.demo.ProgramacionLaboratorioFinalPeliculas.Pelicula;

/**
 * @author Ing. Milton Muñoz
 *         Interface para manejar datos, desde la creacion, lectura y escritura
 */

public interface AccesoDatos {

    // Paso 14 Modificamos el codigo en la interface Acceso Datos
    boolean existe(String nombreArchivo) throws AccesoDatosEx;

    public List<Pelicula> listar(String nombreArchivo) throws LecturaDatosEx;

    void escribir(Pelicula pelicula, String nombreArchivo, boolean anexar) throws EscrituraDatosEx;

    public String buscar(String nombreArchivo, String buscar) throws LecturaDatosEx;

    public void crear(String nombreArchivo) throws AccesoDatosEx;

    public void borrar(String nombreArchivo) throws AccesoDatosEx;

}
