package AProgramacionJava.test;

public class TestArgumentosVariables {
    public static void main(String[] args) {

        imprimirNumeros(3, 4, 5);
        imprimirNumeros(1, 2);

        variosParametros("Juan", 1, 2, 3, 4);
        variosParametros("Jose", 1);
    }

    private static void variosParametros(String nombre, int... numeros) {
        System.out.println("nombre = " + nombre);
        imprimirNumeros(numeros);
    }

    // (int...) Los Argumentos Variables son como arrays,
    // pero no se asigna el número de variables al momento de crear sino en la ejecucion
    private static void imprimirNumeros(int... numeros) {
        for (int numero : numeros) {
            System.out.println("numero = " + numero);
        }
    }
}
