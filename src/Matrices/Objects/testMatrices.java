package Matrices.Objects;

import java.util.Arrays;

public class testMatrices {
    public static void main(String[] args) {

        String[][] frutas = {{"tomate","pepino"},{"cebolla","judias"}};
        System.out.println("frutas = " + Arrays.deepToString(frutas));
        System.out.println("\n");

        //Matriz de edades
        int[][] edades = new int[2][2];
        System.out.println("edades = " + Arrays.deepToString(edades));
        edades[0][0] = 5;
        System.out.println("edades[0][0] = " + edades[0][0]);
        edades[1][0] = 8;
        System.out.println("edades[1][0] = " + edades[1][0]);
        System.out.println("edades = " + Arrays.deepToString(edades));
        System.out.println("\n");

        //Matriz de personas
        Persona[][] personas = new Persona[2][3];
        System.out.println("personas = " + Arrays.deepToString(personas));
        personas[0][0] = new Persona("Joan");
        System.out.println("personas[0][0] = " + personas[0][0]);
        System.out.println("personas[0][1] = " + personas[0][1]);
        System.out.println("personas[1][2] = " + personas[0][2]);
        personas[1][0] = new Persona("kate");
        System.out.println("personas[1][0] = " + personas[1][0]);
        System.out.println("personas[1][2] = " + personas[1][1]);
        System.out.println("personas[1][1] = " + personas[1][2]);
        System.out.println("\n");

        //imprimir matrices
        imprimir(personas);
        System.out.println("personas = " + Arrays.deepToString(personas));
    }

    public static void imprimir(Object[][] matriz){

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.println("Personas"+"[" + i + "][" + j + "] = " + matriz[i][j]);
            }
        }
//        int idx = -1;
//        for (Persona[] persona : personas) {
//            idx++;
//            for (int j = 0; j < personas[idx].length; j++) {
//                System.out.println("personas[" + idx + "][" + j + "] = " + persona[j]);
//            }
//        }
//        System.out.println("\n");
    }
}
