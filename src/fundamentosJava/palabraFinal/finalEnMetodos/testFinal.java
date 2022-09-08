package fundamentosJava.palabraFinal.finalEnMetodos;

import static fundamentosJava.palabraFinal.finalEnMetodos.Persona.MI_CONSTANTE;

public class testFinal {

    public static void main(String[] args) {

//    no se puede modificar una constante
//    MI_CONSTANTE=10;

        System.out.println("Mi constante" + MI_CONSTANTE);


        final Persona persona1 = new Persona();

        //No se puede asignar una nueva referencia de memoria a persona1
//        persona1 = new Persona();
        //si se puede acceder a sus metodos y cambiar sus valores
        persona1.setNombre("Pedro");
        System.out.println("persona1 nombre = " + persona1.getNombre());
        persona1.setNombre("Juan");
        System.out.println("persona1 nombre = " + persona1.getNombre());
    }
}
