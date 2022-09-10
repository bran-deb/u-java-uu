package AProgramacionJava.test.forEach.test;

import AProgramacionJava.test.forEach.Persona;

import java.util.Arrays;

public class ForEach {
    public static void main(String[] args) {
        int[] edades = {5, 6, 7, 8};

        for (int edad : edades) {
            System.out.println("edad = " + edad);
        }

        Persona persona1 = new Persona("Pedro", 15);
        Persona persona2 = new Persona("Juan", 16);
        Persona[] personas = {persona1, persona2};
        System.out.println("\npersonas = " + Arrays.toString(personas));

        for (Persona persona : personas) {
            System.out.println("persona = " + persona);
        }
    }
}
