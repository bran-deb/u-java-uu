package mx.com.gm.ventas;

public class Producto extends Orden {

    private static int contadorProductos;
    private final int idProducto;
    private String nombre;
    private double precio;

    private Producto() {
        this.idProducto = ++Producto.contadorProductos;
    }

    public Producto(String nombre, double precio) {
        this();
        this.nombre = nombre;
        this.precio = precio;
    }

    public int getIdProducto() {
        return this.idProducto;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String newNombre) {
        this.nombre = newNombre;
    }

    public double getPrecio() {
        return this.precio;
    }

    public void setPrecio(double newPrecio) {
        this.precio = newPrecio;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "idProducto=" + idProducto +
                ", nombre='" + nombre + '\'' +
                ", precio=" + precio +
                '}';
    }
}
