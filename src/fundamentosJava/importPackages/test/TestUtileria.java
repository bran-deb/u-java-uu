package fundamentosJava.importPackages.test;
//se cargan en memoria solo cuando se utilizan en el programa
//import bo.com.paquetesJava.paquetes.*;
import fundamentosJava.importPackages.paquetes.Utileria;

import static fundamentosJava.importPackages.paquetes.Utileria.imprimir;

public class TestUtileria {
    public static void main(String[] args) {
        Utileria.imprimir("import de clase");  //import de clase
        imprimir("import de metodo static");           //import de metodo static
        Utileria.imprimir("nombre completamente calificado"); //nombre completamente calificado
    }
}
