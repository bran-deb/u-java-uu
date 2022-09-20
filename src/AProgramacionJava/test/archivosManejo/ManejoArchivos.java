package AProgramacionJava.test.archivosManejo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class ManejoArchivos {

    public static void crearArchivo(String nameArchivo) {
        File file = new File("C:\\Users\\DEB\\101\\JAVA\\u-java-ua\\outputArch.txt");

        try (PrintWriter output = new PrintWriter(file)) {
//            output.close();
            System.out.println("Se ha creado el archivo");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void ScribirArchivo(String nombreArchivo, String contenido) {
        File file = new File(nombreArchivo);

        try {
            PrintWriter output = new PrintWriter(file);
            output.println(contenido);
            output.close();
            System.out.println("Se ha escrito el archivo");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
