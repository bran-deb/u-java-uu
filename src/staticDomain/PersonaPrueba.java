package staticDomain;

public class PersonaPrueba {
    private int contador;

    public static void main(String[] args) {
        Persona persona1 = new Persona("Juan");
        imprimir(persona1);

        Persona persona2 = new Persona("Pedro");
        imprimir(persona2);
//        una variable no estatica no puede ser referenciada desde un contexto estatico
//        this.contador = 10;
    }

    public static void imprimir(Persona persona) {
        System.out.println("persona = " + persona);
    }

    //    un metodo no estatico puede acceder a un metodo estatico
    public int getContador() {
        imprimir(new Persona("Jose"));
        return this.contador;
    }
}
