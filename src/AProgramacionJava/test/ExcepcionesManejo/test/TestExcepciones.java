package AProgramacionJava.test.ExcepcionesManejo.test;

import AProgramacionJava.test.ExcepcionesManejo.excepciones.OperacionExcepcionCheck;

import static AProgramacionJava.test.ExcepcionesManejo.aritmetica.Aritmetica.divisionCheck;

public class TestExcepciones {
    public static void main(String[] args) {
        int resultado = 0;

        //UNCHECK EXCEPTION PARA LA EJECUCION EN TIME COMPILACION
//        resultado = divisionUncheck(10, 0);

        //CHECK EXCEPTION NO PARA LA EJECUCION
        try {
            resultado = divisionCheck(10, 0);
            //resultado = 10 / 0;
        } catch (OperacionExcepcionCheck e) {//excepcion de menor gerarquia
            System.out.println("Ocurrio un error de tipo OperacionExcepcionCheck");
            e.printStackTrace();
        } catch (Exception e) {              //excepcion de mayor gerarquia
            System.out.println("Ocurrio un error de tipo exception: ");
            //e.printStackTrace(System.out);
            e.printStackTrace();
            //System.out.println(e.getMessage());
        } finally {//siempre se ejecuta al final
            System.out.println("Se reviso la division entre cero");
        }
        System.out.println("resultado = " + resultado);
    }
}
