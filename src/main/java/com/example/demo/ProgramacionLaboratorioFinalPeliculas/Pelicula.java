package com.example.demo.ProgramacionLaboratorioFinalPeliculas;

public class Pelicula {

    // Paso 10 Modificamos el codigo en la clase Pelicula

    // Atributo de la clase
    String nombre;

    // Constructor con un argumento

    public Pelicula(String nombre) {
        this.nombre = nombre;
    }

    // metodos get y set de la clase pelicula
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;

    }

    // Metodo to String de la clase

    @Override
    public String toString() {
        return this.nombre;
    }

}
