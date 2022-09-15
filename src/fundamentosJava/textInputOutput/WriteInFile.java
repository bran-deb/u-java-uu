package fundamentosJava.textInputOutput;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class WriteInFile {
    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("C:\\Users\\DEB\\101\\JAVA\\u-java-ua\\outout.txt");

        if (file.exists())
            System.exit(0);

        {
            System.out.println(0);
        }

        PrintWriter output = new PrintWriter(file);

        output.print("Winter is comming");
        output.close();
    }
}
