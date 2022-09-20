package AProgramacionJava.test.Genericos;

public class ClaseGenerica<T> {
    T objeto;

    public ClaseGenerica(T objeto) {
        this.objeto = objeto;
    }

    public void obtenerTipo() {
        System.out.println("EL tipo T es: " + objeto.getClass().getSimpleName());
    }
}
