package staticDomain;

public class Persona {
    private int idPersona;
    private String nombre;
    private static int contadorPersonas;
    public Persona(String nombre){
        this.nombre = nombre;
        //incrementar el contador por cada objeto nuevo
        //Atributo de clase, no del objeto (static se asocia con la clase y no con los objetos)
        Persona.contadorPersonas++;
        //Asignar el nuevo valor a la variable idPersona
        this.idPersona = Persona.contadorPersonas;
        //(this) para atributos no estaticos (nombreClase) para atributos que son estaticos
    }

    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "idPersona=" + idPersona +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
