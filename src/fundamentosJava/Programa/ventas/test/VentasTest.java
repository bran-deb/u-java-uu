package fundamentosJava.Programa.ventas.test;

import fundamentosJava.Programa.ventas.Orden;
import fundamentosJava.Programa.ventas.Producto;

public class VentasTest {
    public static void main(String[] args) {
        Producto producto1 = new Producto("Arroz",40.00);
        Producto producto2 = new Producto("Fideo",20.00);

        Orden orden1 = new Orden();
        orden1.mostrarOrden();
        orden1.agregarProducto(producto1);
        orden1.mostrarOrden();
        orden1.agregarProducto(producto2);
        orden1.mostrarOrden();
    }
}
