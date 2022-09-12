package AProgramacionJava.test.instanceeOf.domain.test;

import AProgramacionJava.test.instanceeOf.domain.Empleado;
import AProgramacionJava.test.instanceeOf.domain.Gerente;

public class TestInstanceOf {
    public static void main(String[] args) {

//        Gerente gerente1 = new Gerente("Juan", 500, "Sistemas");
//        TestInstanceOf.determinarTipo(gerente1);
        Empleado empleado1 = new Empleado("Pedro", 400);
        TestInstanceOf.determinarTipo(empleado1);
    }

    //DEPENDIENDO DEL TIPO DE EMPLEADO IMPRIME DIFERENTES DATOS AL MOMENTO DE EJECUCION
    public static void determinarTipo(Empleado tipoEmpleado) {

        if (tipoEmpleado instanceof Gerente) {
            System.out.println("\nEs de tipo Gerente");
            System.out.println(((Gerente) tipoEmpleado).getDepartamento());
        } else if (tipoEmpleado != null) {//ya se sabe que tiene tipo Empleado
            System.out.println("\nEs de tipo Empleado");
//            System.out.println(((Gerente) tipoEmpleado).getDepartamento());//no se puede pasar una clase padre a una hija
            System.out.println(tipoEmpleado.obtenerDetalles());
        } else if (tipoEmpleado instanceof Object) {
            System.out.println("\nEs de tipo object");
            System.out.println(tipoEmpleado.toString());
        }
    }
}
