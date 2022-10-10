package Homework11.ex1;


import java.util.*;

public class MapEx {
    public static void main(String[] args) {
        //1 -create a map with key student(string) and value the grade. Print all students and their grades.
        //Find the student with the highest grade
        Map<String, Integer> studentGrade = new HashMap<>();
        studentGrade.putIfAbsent("Geo", 5);
        studentGrade.putIfAbsent("Ion", 4);
        studentGrade.putIfAbsent("Mircea", 9);
        studentGrade.putIfAbsent("Geo", 6);
        studentGrade.putIfAbsent("Sandu", 8);

        //listam toti studentii si notele lor
        System.out.println(studentGrade);

        bestStudentGrade(studentGrade);



    }

    public static void bestStudentGrade(Map<String, Integer> noteStudenti) {
        String result = null;
        Integer nota = null;
        for (Map.Entry<String, Integer> note : noteStudenti.entrySet()) {
            if (note.getValue() != null) {
                if (nota == null || note.getValue() > nota) {
                    result = note.getKey();
                    nota = note.getValue();
                }
            }

        }
        System.out.println(String.format("Studentul cu nota max e %s, si a luat nota %d", result, nota));

    }


}
