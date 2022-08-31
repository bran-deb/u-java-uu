package Matrices.Objects;

import java.util.Arrays;

public class testObject {
    public static void main(String[] args) {
        Persona[] personas = new Persona[3];
        System.out.println("\npersonas[] = " + Arrays.toString(personas));

        personas[0] = new Persona("Yun");
        System.out.println("personas[0] = " + personas[0]);

        personas[1] = new Persona("deb");
        System.out.println("personas[1] = " + personas[1]);

        System.out.println("personas[2] = " + personas[2]);

        System.out.println("\npersonas[] = " + Arrays.toString(personas));


        System.out.println("\niteracion de Personas");
//        for (int i = 0; i < personas.length; i++) {
//            System.out.println(i+" persona"+personas[i]);
//        }
        int index = 0;
        for (Persona persona : personas) {
            System.out.println("personas[" + (index++) + "] " + persona);
        }

        System.out.println();
        String[] frutas = {"mango", "banana", "manzana"};
        System.out.println("frutas = " + Arrays.toString(frutas));

        int indice = 0;
        for (String fruta : frutas) {
            System.out.println("frutas[" + (indice++) + "] = " + fruta);
        }
    }
}
