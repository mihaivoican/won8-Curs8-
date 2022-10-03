package Homework10;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class ReadFromFile {
//    public static void main(String[] args) throws IOException {
//       List<StudentGrade> listaNoteStudenti= addListaNoteStudenti("files/grades.txt");
//        System.out.println();
//    }

    public static ArrayList<StudentGrade> addListaNoteStudenti(String file) throws IOException {
        ArrayList<StudentGrade> result = new ArrayList<StudentGrade>();
        BufferedReader br = new BufferedReader(new FileReader(file));
        String line;
        while ((line= br.readLine()) !=null){
            //sparg linia in bucati de sir dupa delimitator |. va rezilta array de String
            String[] tokens = line.split(Pattern.quote("|"));
            //dupa ce sparg in
            StudentGrade studentNota= new StudentGrade(tokens[0],tokens[1],Integer.parseInt(tokens[2].replaceAll("\\D", "")));
            result.add(studentNota);
        }
        return result;
    }

}
