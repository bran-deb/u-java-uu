package AProgramacionJava.test.claseObject.test;

import AProgramacionJava.test.claseObject.Empleado;

public class TestClassObject {
    public static void main(String[] args) {

        Empleado empleado1 = new Empleado("Juan", 5000);
        Empleado empleado2 = new Empleado("Juan", 5000);

        if (empleado1 == empleado2) {
            System.out.println("\nTienen la misma referencia en memoria");
        } else {
            System.out.println("\nTienen distinta referencia en memoria");
        }


        if (empleado1.equals(empleado2)) {
            System.out.println("\nLos objetos son iguales en contenido");
        } else {
            System.out.println("\nLos objetos son diferentes en contenido");
        }


        if (empleado1.hashCode() == empleado2.hashCode()) {
            System.out.println("\nEl valor de hashcode es igual");
        } else {
            System.out.println("\nEl valor de hashcode es diferente");
        }
    }
}
