package AProgramacionJava.test.Interfaces.accesodatos.test;

import AProgramacionJava.test.Interfaces.accesodatos.IAccesoDatos;
import AProgramacionJava.test.Interfaces.accesodatos.ImplementacionMySQL;
import AProgramacionJava.test.Interfaces.accesodatos.ImplementacionOracle;

public class TestInterfaces {
    public static void main(String[] args) {
        IAccesoDatos datosMysql = new ImplementacionMySQL();
//        datosMysql.listar();
        IAccesoDatos datosOracle = new ImplementacionOracle();
//        datosOracle.listar();

        imprimir(datosMysql);
        imprimir(datosOracle);
    }

    public static void imprimir(IAccesoDatos datos) {
        datos.listar();
    }
}
