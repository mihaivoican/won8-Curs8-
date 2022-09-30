package ReadingWritingFile;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class ObjectsFromFile {
    public static void main(String[] args) throws IOException {
        List<Person> personList = readPersons("files/persons.data");
        writeReport(personList);
    }

    private static void writeReport(List<Person> personList) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter("files/report.data"));
        for (Person person : personList) {
            writer.write(personToLine(person));
            writer.newLine();
        }
        writer.close();
    }

    public static List<Person> readPersons(String filePath) throws IOException {
        List<Person> result = new ArrayList<>();
        BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath));
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            result.add(personFromLine(line));
        }
        System.out.println();       //doar pt debug
        return result;

    }

    private static String personToLine(Person person) {
        return String.format("%s has age %d with position %s", person.getName(), person.getAge(), person.getPosition());
    }

    private static Person personFromLine(String line) {
        String[] tokens = line.split(Pattern.quote("|"));
        return new Person(tokens[0], Integer.parseInt(tokens[1].replaceAll("\\D", "")), tokens[2]);
    }
}
