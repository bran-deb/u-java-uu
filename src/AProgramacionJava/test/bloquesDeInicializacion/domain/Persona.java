package AProgramacionJava.test.bloquesDeInicializacion.domain;

public class Persona {
    private final int idPersona;
    private static int contadorPersonas;

    //ORDEN DE EJECUCION EN JAVA
    //bloque de inicializacion estatico
    static {
        System.out.println("\nEjecucion bloque estatico");
        ++Persona.contadorPersonas;
        //this.idPersona=10 /No se puede acceder desde un contexto stati
    }

    //bloque de inicializacion no static
    //se ejecuta antes del constructor de la clase
    {
        System.out.println("Ejecucion bloque No estatico");
        this.idPersona = Persona.contadorPersonas;
    }

    public Persona() {
        System.out.println("Ejecucion del constructor");
    }

    public int getIdPersona() {
        return idPersona;
    }
}
