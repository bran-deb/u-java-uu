package fundamentosJava.pasoporReferencia;

import fundamentosJava.clases.Persona;

public class PasoPorReferencia {

    public static void main(String[] args) {
//        Persona persona1 = null;
        Persona persona1 = new Persona();
        persona1.setNombre("pedro");
        System.out.println("Persona1 sin cambio: ".concat(persona1.getNombre()));
        persona1 = cambiaValor(persona1);
        System.out.println("personaUpdate cambio: ".concat(persona1.getNombre()));
    }

    //referencia al mismo objeto persona
    public static Persona cambiaValor(Persona persona){

        if(persona == null){
            System.out.println("valor de persona invalido : null");
            return null;
        }
        persona.setNombre("Juan");
        return persona;
    }
}
