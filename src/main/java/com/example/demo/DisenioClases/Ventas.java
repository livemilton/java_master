package com.example.demo.DisenioClases;

public class Ventas {

    public static void main(String[] args) {

        // Crear varios objetos de tipo Producto
        Producto producto1 = new Producto("Camisa", 50);

        Producto producto2 = new Producto("Pantalon", 100);

        Producto producto3 = new Producto("Jean basico", 120);

        // Creamos un objeto de tipo orden
        Orden orden1 = new Orden();
        Orden orden2 = new Orden();

        // Agregamos los productos a la orden
        orden1.agregarProducto(producto1);
        orden1.agregarProducto(producto2);

        orden2.agregarProducto(producto1);
        orden2.agregarProducto(producto2);
        orden2.agregarProducto(producto3);

        // Imprimir la orden
        orden1.mostarOrden();

        orden2.mostarOrden();

    }

}
