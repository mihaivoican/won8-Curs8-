package exceptions;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class ExceptionsMain {
    public static void main(String[] args) throws FileNotFoundException {
//        Integer a = null;
//        a.toString();

//        Scanner scanner = new Scanner(System.in);
//        int i = scanner.nextInt();
//        if (i > 1000) {
//            throw new RuntimeException("Number is too large");
//        }
//        System.out.println(i * i);

        int[] ints = {12, 12};
//        doSomethingUnexpected(ints);
        doSomethingExpected("asadada");
    }

    public static void doSomethingUnexpected(int[] numbers) {
        int number = numbers[100];
        // it's important to have the 100th element
    }

    public static void doSomethingExpected(String filePath) throws FileNotFoundException {
        String defaultPath = "default.txt";
        BufferedReader reader;
        try {
            reader = new BufferedReader(new FileReader(filePath));
            // i'm happy
        } catch (FileNotFoundException e) {
            reader = new BufferedReader(new FileReader(defaultPath));
        }
    }
}
