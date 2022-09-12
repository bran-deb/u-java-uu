package AProgramacionJava.test.sobreescrituraPolimorfismo.domain.test;

import AProgramacionJava.test.sobreescrituraPolimorfismo.domain.Empleado;
import AProgramacionJava.test.sobreescrituraPolimorfismo.domain.Gerente;

public class TestSobreescritura {
    public static void main(String[] args) {
        Gerente gerente1 = new Gerente("Juan", 500, "Sistemas");
        System.out.println("\ngerente1 :: " + gerente1.obtenerDetalles());

        Empleado empleado1 = new Empleado("Pedro", 400);
        System.out.println("\nempleado1 :: " + empleado1.obtenerDetalles());


        //IMPLEMENTANDO POLIMORFISMO
        //MULTIPLES COMPORTAMIENTOS DEPENDIENDO A QUIEN APUNTA EL METODO
        TestSobreescritura.imprimir(gerente1);
        TestSobreescritura.imprimir(empleado1);
    }

    //DEPENDIENDO DEL TIPO DE EMPLEADO IMPRIME DIFERENTES DATOS AL MOMENTO DE EJECUCION
    public static void imprimir(Empleado tipoEmpleado) {
        System.out.println("\ntipoEmpleado = " + tipoEmpleado.obtenerDetalles());
    }
}
