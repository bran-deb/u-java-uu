package AProgramacionJava.test.bloquesDeInicializacion.test;

import AProgramacionJava.test.bloquesDeInicializacion.domain.Persona;

public class TestBloquesInicializacion {
    public static void main(String[] args) {
        Persona persona1 = new Persona();
        System.out.println("persona1 = " + persona1 + "\n");

        Persona persona2 = new Persona();
        System.out.println("persona2 = " + persona2);
    }
}
