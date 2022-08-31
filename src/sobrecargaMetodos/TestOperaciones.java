package sobrecargaMetodos;

public class TestOperaciones {
    public static void main(String[] args) {
        var resultado = Operaciones.sumar(2,3);
        System.out.println("resultado = " + resultado);
        
        var resultado2 = Operaciones.sumar(5.5,4.5);
        System.out.println("resultado2 = " + resultado2);

        var resultado3 = Operaciones.sumar(3,5L);
        System.out.println("resultado3 = " + resultado3);
    }
}
