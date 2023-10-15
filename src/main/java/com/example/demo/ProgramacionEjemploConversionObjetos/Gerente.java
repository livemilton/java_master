package com.example.demo.ProgramacionEjemploConversionObjetos;

public class Gerente extends Empleado {

    // Atributo de la clase
    private String departamento;

    // Constructor herado con argumento propio de la clase Gerente

    public Gerente(String nombre, double sueldo, String departamento) {
        super(nombre, sueldo);
        this.departamento = departamento;

    }

    // metodo de la clase Gerente heredado de la clase Empleado sobreescrito

    @Override
    public String obtenerDetalles() {
        return super.obtenerDetalles() + ", departamento: " + this.departamento;
    }

    // Metodos getter y setter para el atributo de la clase Departmento
    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

}
