package Homework10;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        ArrayList<StudentGrade> listaStudentiNote = ReadFromFile.addListaNoteStudenti("files/grades.txt");
        //listam toata lista de stud si note
        for (StudentGrade sn : listaStudentiNote) {
            System.out.println(String.format("Student %s, disciplina %s, nota %s", sn.getName(), sn.getDiscipline(), sn.getGrade()));
        }

        Classroom clasa = new Classroom(listaStudentiNote);
        //listam note la o materie
        List<Integer> listaNote = clasa.getGradesForDiscipline("Mathematics");
        System.out.println(listaNote);

        //lista note student
        List<Integer> listaNote2 = clasa.getGradesForStudent("Dulf Siguror");
        System.out.println(listaNote2);

        //listam stud cu nota max la mate
        StudentGrade sg = clasa.getMaxGrade("Mathematics");
        System.out.println(sg.toString());

        //listam stud cu cea mai mare nota dintre toate
        StudentGrade sg2 = clasa.getMaxGrade();
        System.out.println(sg2.toString());

        //lista media note / disciplina
        Integer media = clasa.getAverageGrade("Mathematics");
        System.out.println("Media la mate:" +media);

        StudentGrade sg3 = clasa.getWorstGrade("Mathematics");
        System.out.println("Cea mai proasta nota la mate");
        System.out.println(sg3);

        //lista tututror studentilor cu nota min la o materie
        List<StudentGrade> lst = clasa.getWorstGrade2("Mathematics");
        System.out.println("Lista cu stud cu cele mai proaste note  la mate");
        for (StudentGrade st : lst){
            System.out.println(st.toString());
        }
    }
}
