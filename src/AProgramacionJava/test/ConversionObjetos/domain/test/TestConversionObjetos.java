package AProgramacionJava.test.ConversionObjetos.domain.test;

import AProgramacionJava.test.ConversionObjetos.domain.Empleado;
import AProgramacionJava.test.ConversionObjetos.domain.Escritor;
import AProgramacionJava.test.ConversionObjetos.domain.Gerente;
import AProgramacionJava.test.ConversionObjetos.domain.TipoEscritura;

public class TestConversionObjetos {
    public static void main(String[] args) {

        Empleado empleado;
        empleado = new Empleado("Juan", 500);
        System.out.println("\nempleado = " + empleado);

        empleado = new Escritor("Juan", 500, TipoEscritura.CLASICO);
        System.out.println("\nempleado = " + empleado);
        //DOWN CASTING
        ((Escritor) empleado).getTipoEscritura();

        empleado = new Gerente("Juan", 5000, "Sistemas");
        System.out.println("\nempleado = " + empleado);

        //DOWN CASTING
        //conversion de variable tipo padre a hijo(se especifica el tipo con cast)
        Escritor escritor = (Escritor) empleado;
        //UP CASTING
        //conversion de variable tipo hijo a padre(no se pespeficica el tipo)
        Empleado emplead1 = empleado;
    }
}
