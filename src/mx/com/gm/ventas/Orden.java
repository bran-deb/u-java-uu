package mx.com.gm.ventas;

import java.util.Arrays;

public class Orden {
    private static final int MAX_PRODUCTOS = 10;
    private static int contadorOrdenes;
    private final Producto[] productos;
    private int idOrden;
    private int numeroProductos;

    public Orden() {
        this.idOrden = ++Orden.contadorOrdenes;
        this.productos = new Producto[Orden.MAX_PRODUCTOS];
    }

    public int getIdOrden() {
        return this.idOrden;
    }

    public void setIdOrden(int newIdOrden) {
        this.idOrden = newIdOrden;
    }

    public Producto[] getProductos() {
        return this.productos;
    }

    @Override
    public String toString() {
        return "Orden{" +
                "idOrden=" + idOrden +
                ", productos=" + Arrays.toString(productos) +
                '}';
    }

    public void agregarProducto(Producto newProducto) {
        if (this.numeroProductos < Orden.MAX_PRODUCTOS) {
            this.productos[this.numeroProductos++] = newProducto;
        } else {
            System.out.println("Se ha superado el maximo de productos" + Orden.MAX_PRODUCTOS);
        }
    }

    public double calcularTotal() {
        double total = 0;
        for (int i = 0; i < this.numeroProductos; i++) {
//            Producto producto = this.productos[i];
//            total +=  producto.getPrecio();
            total += productos[i].getPrecio();
        }
        return total;
    }

    public void mostrarOrden() {
        System.out.println("\nId Orden: " + idOrden);
        System.out.println("Total de la orden: $" + calcularTotal());
        System.out.println("Productos de la orden: ");
        if (numeroProductos == 0) {
            System.out.println("No hay productos");
        }
        for (int i = 0; i < this.numeroProductos; i++) {
            System.out.println("Nombre = " + this.productos[i]);
        }
    }
}
