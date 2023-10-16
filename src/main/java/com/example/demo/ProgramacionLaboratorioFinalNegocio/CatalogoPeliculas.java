package com.example.demo.ProgramacionLaboratorioFinalNegocio;

public interface CatalogoPeliculas {

    // Paso 16 Modificamos el codigo en la interface Catalogo Peliculas
    public void agregarPelicula(String nombrePelicula, String nombreArchivo);

    public void listarPeliculas(String nombreArchivo);

    public void buscarPelicula(String nombreArchivo, String buscar);

    public void iniciarArchivo(String nombreArchivo);

}
