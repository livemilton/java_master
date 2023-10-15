package com.example.demo.ProgramacionEjemploJavaBeans;

import java.io.Serializable;

public class PersonaBean implements Serializable {

    // Implementar interface serializable
    // java bean
    // 1. Cada uno de los atributos debe de ser privado
    private String nombre;
    private int edad;

    // 2. Debe de tener constructor vacio
    public PersonaBean() {

    }

    // 3. Constructor con argumentos
    public PersonaBean(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // 4. Metodos getter y setter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    // Opcional al bean
    @Override
    public String toString() {
        return "PersonaBean [nombre=" + nombre + ", edad=" + edad + "]";
    }

}
