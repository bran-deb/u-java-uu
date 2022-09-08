package fundamentosJava.palabraThis;

public class PalabraThis {
    public static void main(String[] args) {
        Persona persona = new Persona("Juan","Perez");
        System.out.println("persona = " + persona);
        System.out.println("nombre = " + persona.nombre);
        System.out.println("apellido = " + persona.apellido);
    }
}

//default o packaje solo disponible dentro del packaje palabraThis
class Persona{
    String nombre;
    String apellido;
    Persona(String nombre, String apellido){
//        super(); llamada al constructor de la clase Padre (Object)
        this.nombre = nombre;
        this.apellido = apellido;
        System.out.println("Objeto Persona usando this. : " + this);

//        sintaxis que se usa usualmente
//        Imprimir imprimir = new Imprimir();
        new Imprimir().imprimir(this);
    }
}

//this apunta a ol objeto padre que seria Object
class Imprimir{

    public Imprimir(){
        super();    //el constructor de la clase object(padre) para reservar memoria
    }

    public void imprimir(Persona persona){
        System.out.println("persona desde imprimir = " + persona);
        System.out.println("impresion del objet actual (this.) = " + this);
    }
}