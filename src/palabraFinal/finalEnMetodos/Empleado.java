package palabraFinal.finalEnMetodos;

import static palabraFinal.finalEnMetodos.Persona.MI_CONSTANTE;

public class Empleado extends Persona{

    //si el metodo de la clase padre es final no se puede sobreescribir(imprimir)
    @Override
    public void imprimir(){
        System.out.println("metodo imprimir desde Empleado");
    }

    //llamada al metodo padre sin sobreescribir porque tiene nombre de imprimirP
    public void imprimirP() {
        super.imprimir();
    }
}
