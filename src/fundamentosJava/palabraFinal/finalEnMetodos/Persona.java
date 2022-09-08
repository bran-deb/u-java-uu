package fundamentosJava.palabraFinal.finalEnMetodos;

public class Persona {

    public final static int MI_CONSTANTE = 10;

    private String nombre;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
//    No se puede sobreescribir un metodo definido con final
//    public final void imprimir(){System.out.println("metodo imprimir desde Persona"); }

    public void imprimir(){
        System.out.println("metodo imprimir desde Persona");
    }
}
