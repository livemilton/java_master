package com.example.demo.DisenioClases;

public class Producto {

    private int idProducto;
    private String nombre;
    private double precio;
    private static int contadorProductos;

    // constructor vacio
    public Producto() {
        this.idProducto = ++contadorProductos;
    }

    // constructor sobreccargado de 2 argumentos
    public Producto(String nombre, double precio) {
        this();
        this.nombre = nombre;
        this.precio = precio;
    }

    public int getIdProducto() {
        return idProducto;
    }

    // se modifica en el constructor vacio
    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public static int getContadorProductos() {
        return contadorProductos;
    }

    // se incrementa en el constructor vacio
    public static void setContadorProductos(int contadorProductos) {
        Producto.contadorProductos = contadorProductos;
    }

    @Override
    public String toString() {
        return "Producto [idProducto=" + idProducto + ", nombre=" + nombre + ", precio=" + precio + "]";
    }

}
