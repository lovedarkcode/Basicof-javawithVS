package exceptionHandeling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class newCheckexception {
    public static void main(String[] args) {
        try {
            File file = new File("example.txt");
            Scanner scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            System.out.println(e);
        } finally {
            System.out.println("This will execute every-time");
        }

    }

}
