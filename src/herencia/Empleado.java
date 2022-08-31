package herencia;

public class Empleado extends Persona{
    private final int idEmpleado;
    private double sueldo;
    private static int contadorEmpleado;

    public Empleado(){
        super();    //llamada al contructor sin agumentos de Persona
        this.idEmpleado = ++Empleado.contadorEmpleado;
    }

    public Empleado(String nombre, double sueldo) {
//        super(nombre);
        this(); //llamada al contructor sin argumentos de la misma clase
        this.nombre = nombre;   //atributo heredado de la clase Persona
        this.sueldo = sueldo;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return "Empleado{" + "idEmpleado=" + this.idEmpleado +
                ", sueldo=" + this.sueldo +
                ", " + super.toString() +
                '}';
    }
}
