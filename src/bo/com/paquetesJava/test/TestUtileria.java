package bo.com.paquetesJava.test;
//se cargan en memoria solo cuando se utilizan en el programa
//import bo.com.paquetesJava.paquetes.*;
import bo.com.paquetesJava.paquetes.Utileria;
import static bo.com.paquetesJava.paquetes.Utileria.imprimir;

public class TestUtileria {
    public static void main(String[] args) {
        Utileria.imprimir("import de clase");  //import de clase
        imprimir("import de metodo static");           //import de metodo static
        bo.com.paquetesJava.paquetes.Utileria.imprimir("nombre completamente calificado"); //nombre completamente calificado
    }
}
