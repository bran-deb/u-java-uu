package AProgramacionJava.test.autoboxingUnboxing.test;

public class TestAutoboxingUnboxing {
    public static void main(String[] args) {
        /*
        Clases envolventes de tipos primitivos
        TIENEN ATRIBUTOS Y METODOS
        si se quiere usar objetos en java se usa las clases envolventes

        int - Integer
        long - Long
        float - Float
        Double - Double
        */

        //AUTOBOXING
        Integer entero = 10;
        System.out.println("entero = " + entero.hashCode());
        System.out.println("entero = " + entero.floatValue());
         
        //UNBOXING
        //int entero2 = Integer.valueOf(entero);
        int entero2 = entero;
        System.out.println("entero2 = " + entero2);
    }
}
