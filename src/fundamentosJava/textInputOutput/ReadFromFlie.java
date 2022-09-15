package fundamentosJava.textInputOutput;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFromFlie {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("C:\\Users\\DEB\\101\\JAVA\\u-java-ua\\outout.txt");

        Scanner input = new Scanner(file);

        while (input.hasNextLine()) {
            String temp = input.next();
            System.out.println(temp);
        }
        input.close();
    }
}
