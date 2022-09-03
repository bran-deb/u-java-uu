package com.gm.mundopc;

public class Monitor {
    private static int contadorMonitores;
    private final int idMonitor;
    private String marca;
    private double tamanio;

    private Monitor() {
        this.idMonitor = ++Monitor.contadorMonitores;
    }

    public Monitor(String marca, double tamanio) {
        this();
        this.marca = marca;
        this.tamanio = tamanio;
    }

    public int getIdMonitor() {
        return this.idMonitor;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String newMarca) {
        this.marca = newMarca;
    }

    public double getTamanio() {
        return this.tamanio;
    }

    public void setTamanio(double newTamanio) {
        this.tamanio = newTamanio;
    }

    @Override
    public String toString() {
        return "Monitor{" +
                "idMonitor=" + idMonitor +
                ", marca='" + marca + '\'' +
                ", tamaio=" + tamanio +
                '}';
    }
}
