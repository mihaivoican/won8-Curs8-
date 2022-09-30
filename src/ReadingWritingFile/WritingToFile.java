package ReadingWritingFile;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WritingToFile {

    public static void main(String[] args) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter("files/output.txt", true));
        writer.write("This is my first output  line" + System.lineSeparator());
//        writer.newLine();
        writer.write("This is my second output line");
        writer.newLine();
        writer.close();
    }
}
