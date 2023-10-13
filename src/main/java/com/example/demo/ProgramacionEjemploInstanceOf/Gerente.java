package com.example.demo.ProgramacionEjemploInstanceOf;

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
        return "Nombre: " + this.nombre + ", sueldo: " + this.sueldo
                + ", departamento: " + this.departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

}
