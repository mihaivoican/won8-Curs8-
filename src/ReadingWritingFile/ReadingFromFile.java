package ReadingWritingFile;

import java.io.*;
import java.util.Scanner;

public class ReadingFromFile {
    public static void main(String[] args) throws IOException {
        readingFirstLine();
        readingAllFile();
        readFileBuffered();
    }

    //metoda 2
    private static void readFileBuffered() throws IOException {
        System.out.println("Buffered read:");
//        se da calea la fisier incepand cu radacina proiectului
        BufferedReader bufferedReader = new BufferedReader(new FileReader("files/content.txt"));
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            System.out.println(line);
        }
    }


    //metoda 1
    private static void readingAllFile() throws FileNotFoundException {
        System.out.println("Starting to read all file!");
        Scanner scanner = new Scanner(new File("files", "content.txt"));
        while (scanner.hasNext()) {
            System.out.println(scanner.nextLine());
        }
    }

    //citim doar 1 linie
    private static void readingFirstLine() throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("files", "content.txt"));
        String s = scanner.next();
        int i = scanner.nextInt();
        System.out.println(s);
        System.out.println(i);
    }
}
