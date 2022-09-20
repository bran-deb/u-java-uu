package AProgramacionJava.test.archivosManejo.test;

import AProgramacionJava.test.archivosManejo.ManejoArchivos;

public class TestManejoArchivos {
    public static void main(String[] args) {

        var nombreArchivo = "prueba.txt";
        ManejoArchivos.crearArchivo(nombreArchivo);
        ManejoArchivos.ScribirArchivo(nombreArchivo, "Winter is comming");
    }
}
