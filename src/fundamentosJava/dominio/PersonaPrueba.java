package fundamentosJava.dominio;

public class PersonaPrueba {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Juan",5000.00,false);
        persona1.setNombre("Juan Carlos");

        //Si el metodo toString está definido basta con imprimir persona1(El objeto)
        System.out.println("persona1 = " + persona1);
    }
}
