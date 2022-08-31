package herencia;

import java.util.Date;

public class PruebaPersona {
    public static void main(String[] args) {

        Persona persona1 = new Persona("Fabi",'f',20,"Prado Suecia");
        System.out.println(persona1);

        Empleado empleado1 = new Empleado("Andrea",4000.00);
        System.out.println("WWempleado1 = " + empleado1);

        var fecha = new Date();
        Cliente cliente1 = new Cliente("Andrea", 'f',25,"Plaza Colon",fecha,true);
        System.out.println("cliente1 = " + cliente1);

        Persona persona2 = new Persona();
    }
}
