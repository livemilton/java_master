package com.example.demo.ProgramacionEjemploPolmorfismo;

public class Gerente extends Empleado {

    // atributos de la clase hija gerente
    private String departamento;

    // constructor hereado de la clase padre con 2 + 1 argumento de la clase hija
    public Gerente(String nombre, double sueldo, String departamento) {
        super(nombre, sueldo);
        this.departamento = departamento;
    }

    // Sobreescribir el metodo padre heredado anotación Override pues se
    // sobreescribe el metodo de la clase padre
    /**
     * @return
     */
    @Override
    public String obtenerDetalles() {

        // reutilizar codigo del metodo de la clase padre
        return super.obtenerDetalles()
                + ", departamento: " + this.departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

}
