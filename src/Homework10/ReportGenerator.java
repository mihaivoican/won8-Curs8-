package Homework10;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

//mostenesc clasa Classroom
public class ReportGenerator extends Classroom {
//    private List<StudentGrade> listaStudentNota;

    //constructor
    public ReportGenerator(ArrayList<StudentGrade> listaStudentiNote) {
        super(listaStudentiNote);
    }

    //generez raport in fisier
    public void generateReport() throws IOException {
        StudentGrade stNotaMAx = super.getMaxGrade();
        Integer notaMedie = getAverageGradeClass();
        StudentGrade stNotaMin = getWorstGradeClass();
        BufferedWriter writer = new BufferedWriter(new FileWriter("files/grade-reports.out", true));
        writer.write("Cea mai mare nota: " +stNotaMAx.getName() + " " +stNotaMAx.getGrade() + System.lineSeparator());
        writer.write("Nota medie: " +notaMedie +System.lineSeparator());
        writer.write("Cea mai mica nota: " + stNotaMin.getName() + " " + stNotaMin.getGrade() +System.lineSeparator());
        writer.close();
    }


    public Integer getAverageGradeClass() {
        Integer sum = 0;
//        Integer count =0;
        for (StudentGrade s : super.getListaStudentiNote()) {
            sum += s.getGrade();
//                count++;
        }
//        return sum/count;
        return sum / super.getListaStudentiNote().size();
    }

    public StudentGrade getWorstGradeClass() {
        StudentGrade sg = new StudentGrade(null, null, 11);
        for (StudentGrade s : super.getListaStudentiNote()) {
            if (s.getGrade() < sg.getGrade()) {
                sg.setName(s.getName());
                sg.setDiscipline(s.getDiscipline());
                sg.setGrade(s.getGrade());
            }
        }
        return sg;
    }

}
