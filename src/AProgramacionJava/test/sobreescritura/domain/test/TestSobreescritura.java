package AProgramacionJava.test.sobreescritura.domain.test;

import AProgramacionJava.test.sobreescritura.domain.Empleado;
import AProgramacionJava.test.sobreescritura.domain.Gerente;

public class TestSobreescritura {
    public static void main(String[] args) {
        Gerente gerente1 = new Gerente("Juan", 500, "Sistemas");
        System.out.println("\ngerente1 :: " + gerente1.obtenerDetalles());

        Empleado empleado1 = new Empleado("Pedro", 400);
        System.out.println("\nempleado1 :: " + empleado1.obtenerDetalles());
    }
}
