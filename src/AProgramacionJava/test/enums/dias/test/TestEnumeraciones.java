package AProgramacionJava.test.enums.dias.test;

import AProgramacionJava.test.enums.dias.Continentes;
import AProgramacionJava.test.enums.dias.Dias;

public class TestEnumeraciones {
    public static void main(String[] args) {
//        System.out.println("Dias.LUNES = " + Dias.LUNES);
//        TestEnumeraciones.indicarDiaSemana(Dias.JUEVES);

        System.out.println("Continente No. 1 :" + Continentes.AMERICA);
        System.out.println("Numero de paises :" + Continentes.AMERICA.getNumPaises());

        System.out.println("Continente No. 4 :" + Continentes.AFRICA);
        System.out.println("Numero de paises :" + Continentes.AFRICA.getNumPaises());
    }

    private static void indicarDiaSemana(Dias dias) {
        switch (dias) {
            case LUNES -> System.out.println("Primer dia de la semana");
            case MARTES -> System.out.println("Segundo dia de la semana");
            case MIERCOLES -> System.out.println("Tercer dia de la semana");
            case JUEVES -> System.out.println("JUEVES: cuarto dia de la semana");
        }
    }
}
