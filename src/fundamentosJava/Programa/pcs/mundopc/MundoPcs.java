package fundamentosJava.Programa.pcs.mundopc;

import fundamentosJava.Programa.pcs.gm.mundopc.*;

public class MundoPcs {
    public static void main(String[] args) {
        Monitor monitorHP = new Monitor("HP", 13);
        Teclado tecladoHP = new Teclado("bluetooth", "HP");
        Raton ratonHP = new Raton("bluettoth", "HP");
        Computadora computadoraHP = new Computadora("Computadora", monitorHP, tecladoHP, ratonHP);

        Monitor monitorGamer = new Monitor("Razer", 13);
        Teclado tecladoGamer = new Teclado("USB", "Razer");
        Raton ratonGamer = new Raton("USB", "Razer");
        Computadora computadoraGamer = new Computadora("Computadora Gamer", monitorGamer, tecladoGamer, ratonGamer);

        Orden orden2 = new Orden();
        orden2.agregarComputadora(computadoraHP);
        orden2.agregarComputadora(computadoraGamer);
        System.out.println("orden2 = " + orden2);
    }
}
