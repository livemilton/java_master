package com.example.demo.DisenioClases;

public class Orden {
    // atributos de clase
    private int idOrden;
    private Producto productos[];// declaramos la variable arreglo
    private static int contadorOrdenes;
    private int contadorProductos;
    private static final int MAX_PRODUCTOS = 10;// constante MAX_PRODUCTOS

    // constructor vacio
    public Orden() {
        this.idOrden = ++contadorOrdenes;
        // inicializar el arreglo
        productos = new Producto[MAX_PRODUCTOS];

    }

    // Metodo agragar producto con validacion
    public void agregarProducto(Producto producto) {
        if (this.contadorProductos < MAX_PRODUCTOS) {
            productos[this.contadorProductos++] = producto;
        } else {
            System.out.println("Se ha superado el maximo de productos: " + MAX_PRODUCTOS);
        }
    }

    // Metodo cacular total
    public double calcularTotal() {
        double total = 0;
        for (int i = 0; i < this.contadorProductos; i++) {
            Producto producto = this.productos[i];
            total += producto.getPrecio();// total = total + producto.getPrecio()

        }
        return total;
    }

    // Metodo Mostrar orden
    public void mostarOrden() {
        System.out.println("orden #: " + this.idOrden);
        double totalOrden = this.calcularTotal();
        System.out.println("Total de la Orden: $" + totalOrden);
        System.out.println("Productos de la Orden: ");
        for (int i = 0; i < this.contadorProductos; i++) {
            Producto producto = productos[i];
            System.out.println(producto);
        }
    }
}
