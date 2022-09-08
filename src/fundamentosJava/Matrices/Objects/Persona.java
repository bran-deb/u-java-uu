package fundamentosJava.Matrices.Objects;

public class Persona {
    public String nombre;

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Persona(" + "nombre:" + nombre + ")";
    }
}
