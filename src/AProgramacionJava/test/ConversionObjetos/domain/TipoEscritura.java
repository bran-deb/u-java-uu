package AProgramacionJava.test.ConversionObjetos.domain;

public enum TipoEscritura {
    CLASICO("Escritura a Mano"),
    MODERNO("Escritura Digital");

    private final String descripcion;

    TipoEscritura(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return this.descripcion;
    }

}
