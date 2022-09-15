package AProgramacionJava.test.clasesAbstractas.test;

import AProgramacionJava.test.clasesAbstractas.FiguraGeometrica;
import AProgramacionJava.test.clasesAbstractas.Rectangulo;

public class TestClasesAvstractas {
    public static void main(String[] args) {

        FiguraGeometrica figura = new Rectangulo("Rectangulo");
        figura.dibujar();
    }
}
