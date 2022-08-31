package clases;

public class Persona {
    private String nombre, apellido;
    private int edad;

    public Persona() {}

    public Persona(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String newNombre) {
        this.nombre = newNombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String newApellido) {
        this.apellido = newApellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int newEdad) {
        this.edad = newEdad;
    }

    public void desplegarInformacion() {
        System.out.println("nombre = " + nombre);
        System.out.println("apellido = " + apellido);
        System.out.println("edad = " + edad);
    }
}
