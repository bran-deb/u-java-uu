package AProgramacionJava.test.Genericos.test;

import AProgramacionJava.test.Genericos.ClaseGenerica;

public class TestGenerics {
    public static void main(String[] args) {
        //Tipos genericos
        ClaseGenerica<Integer> objetoInt = new ClaseGenerica<>(15);
        objetoInt.obtenerTipo();
        ClaseGenerica<String> objetoString = new ClaseGenerica<>("hola");
        objetoString.obtenerTipo();
        ClaseGenerica<Boolean> objetoBoolean = new ClaseGenerica<>(true);
        objetoBoolean.obtenerTipo();
    }
}
