package exceptions;

import java.io.*;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class ErrorMessageMain {
    public static void main(String[] args) throws IOException, NumberTooLargeException, PowerTooLargeException {
        BufferedWriter errorWriter = null;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number:");
        int number = scanner.nextInt();
        System.out.println("Please enter a power:");
        int power = scanner.nextInt();

        System.out.println("The result is:");
        try {
            System.out.println(MathService.computePower(number, power));
        } catch (NumberTooLargeException e) {
            System.out.println(MathService.computePower(e.getNumber() / 10, power));
        } catch (PowerTooLargeException e) {
            errorWriter = new BufferedWriter(new FileWriter("err:±§~orsss.txt"));
            errorWriter.write(e.getMessage());
            errorWriter.newLine();
            errorWriter.write(Arrays.toString(e.getStackTrace()));
            System.out.println(e.getMessage());
        } finally {
            System.out.println("It's finally here!");
            if (errorWriter != null) {
                errorWriter.close();
            }
        }
        System.out.println("I'm still alive");
    }


}
