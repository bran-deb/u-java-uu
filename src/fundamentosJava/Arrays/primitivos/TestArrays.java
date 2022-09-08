package fundamentosJava.Arrays.primitivos;

import java.util.Arrays;

public class TestArrays {
    public static void main(String[] args) {

        int[] edades = new int[3];
        System.out.println("edades = " + Arrays.toString(edades));

        edades[0] = 10;
        System.out.println("edades[0] = " + edades[0]);
        System.out.println("edades = " + Arrays.toString(edades));

        edades[1] = 15;
        System.out.println("edades[1] = " + edades[1]);
        System.out.println("edades = " + Arrays.toString(edades));

        edades[2] = 20;
        System.out.println("edades[2] = " + edades[2]);
        System.out.println("edades = " + Arrays.toString(edades));

        for (int i = 0; i < edades.length; i++) {
            System.out.println("edades elemento = [" + i + "] : " + edades[i]);
        }
    }
}
