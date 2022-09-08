package fundamentosJava.clases;

public class Aritmetica {
    public int  a,b;

    public Aritmetica(){
        System.out.println("Ejecutando Constructor");
    }
    public Aritmetica(int a,int b){
        this.a = a;
        this.b = b;
        System.out.println("Ejecutando Constructor con argumentos");
    }

    public int sumar(){
        return this.a + this.b; //return a + b
    }

    public int sumarConRetorno(int a, int b){
        this.a = a;
        this.b = b;
        return this.sumar();
    }
}
