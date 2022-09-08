package fundamentosJava.clases;

public class PruebaAritmetica {
    public static void main(String[] args) {
        Aritmetica operacion1 = new Aritmetica();
        operacion1.a = 2;
        operacion1.b = 3;

        int result = operacion1.sumar();
        System.out.println("result = " + result);
        result = operacion1.sumarConRetorno(8, 8);
        System.out.println("result = " + result);

        Aritmetica operacion2 = new Aritmetica(5,5);
        int result2 = operacion2.sumar();
        System.out.println("result2 = " + result2);

        //Calcular Volumen
        Caja caja1 = new Caja();
        int resultado = caja1.getVolumen();
        System.out.println("resultado = " + resultado);

        Caja caja2 = new Caja(3,2,6);
        resultado = caja2.getVolumen();
        System.out.println("resultado = " + resultado);
    }
}
