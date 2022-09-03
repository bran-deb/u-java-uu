package com.gm.mundopc;

import java.util.Arrays;

public class Orden {
    private static final int MAX_COMPUTADORAS = 10;
    private static int contadorOrdenes;
    private final int idOrden;
    private final Computadora[] computadoras;
    private int contadorComputadoras;

    public Orden() {
        this.idOrden = ++Orden.contadorOrdenes;
        this.computadoras = new Computadora[Orden.MAX_COMPUTADORAS];
    }

    public void agregarComputadora(Computadora newComputadora) {
        if (this.contadorComputadoras < Orden.MAX_COMPUTADORAS) {
            this.computadoras[this.contadorComputadoras++] = newComputadora;
        } else {
            System.out.println("Has superado el limite: " + Orden.MAX_COMPUTADORAS);
        }
    }

    @Override
    public String toString() {
        return "\nOrden{" +
                "idOrden=" + idOrden +
                ", computadoras=" + Arrays.toString(computadoras) +
                ",\n contadorComputadoras=" + contadorComputadoras +
                '}';
    }
}
