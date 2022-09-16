package AProgramacionJava.test.ExcepcionesManejo.aritmetica;

import AProgramacionJava.test.ExcepcionesManejo.excepciones.OperacionExcepcionCheck;
import AProgramacionJava.test.ExcepcionesManejo.excepciones.OperacionExcepcionUncheck;

public class Aritmetica {

    public static int divisionCheck(int numerador, int denominador) throws OperacionExcepcionCheck {
        if (denominador == 0) {
            throw new OperacionExcepcionCheck("Division entre cero");
        }
        return numerador / denominador;
    }

    //No se manda el throws en el metodo
    public static int divisionUncheck(int numerador, int denominador) {
        if (denominador == 0) {
            throw new OperacionExcepcionUncheck("Division entre cero");
        }
        return numerador / denominador;
    }
}
