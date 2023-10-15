package com.example.demo.ProgramacionEjercicioClaseObject;

public class Empleado {

    // Atributos clase
    private String nombre;
    private double sueldo;

    // Constructor 2 argumentos

    public Empleado(String nombre, double sueldo) {
        this.nombre = nombre;
        this.sueldo = sueldo;

    }

    // Getter y setter

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    // Metodo toString regresa una representacion en una cadena de los valores de
    // nuestro objeto y si se imprime el metodo se trae el estado del objeto
    @Override
    public String toString() {
        return super.toString() + "Empleado [nombre=" + nombre + ", sueldo=" + sueldo + "]";
    }
    // super para ver la direccion en memoria del metodo hascode de la clase padre
    // object

    // Metodo equals y hascode generado por el IDE
    // Hashcode permite obtener un valor entero unico para cada objeto que se cree
    // de la clase empleado
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
        long temp;
        temp = Double.doubleToLongBits(sueldo);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    // metodo equals lo que hace es regresar un booleano y este booleano inidca si
    // los objetos que se estan comparando
    // son iguales o diferentes
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Empleado other = (Empleado) obj;
        if (nombre == null) {
            if (other.nombre != null)
                return false;
        } else if (!nombre.equals(other.nombre))
            return false;
        if (Double.doubleToLongBits(sueldo) != Double.doubleToLongBits(other.sueldo))
            return false;
        return true;
    }

}
