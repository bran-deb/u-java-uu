package com.gm.mundopc;

public class DispositivoEntrada {
    private String tipoEntrada;
    private String marca;

    public DispositivoEntrada(String tipoEntrada, String marca) {
        this.tipoEntrada = tipoEntrada;
        this.marca = marca;
    }

    public String getTipoEntrada() {
        return this.tipoEntrada;
    }

    public void setTipoEntrada(String newTipoEndrata) {
        this.tipoEntrada = newTipoEndrata;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String newMarca) {
        this.marca = newMarca;
    }

    @Override
    public String
    toString() {
        return "\n DispositivoEntrada{" +
                "tipoEntrada='" + tipoEntrada + '\'' +
                ", marca='" + marca + '\'' +
                '}';
    }
}
