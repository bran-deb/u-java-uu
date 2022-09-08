package fundamentosJava.clases;

public class Caja {
    private int ancho;
    private int alto;
    private int profundo;

    public Caja(){
        System.out.println("Constructor sin argumentos ejecutandose");
    }
    public Caja(int ancho, int alto, int profundo){
        this.ancho = ancho;
        this.alto = alto;
        this.profundo = profundo;
        System.out.println("Constructor con argumentos ejecutandose");
    }

    public int getVolumen(){
        return ancho * alto * profundo;
    }
}
