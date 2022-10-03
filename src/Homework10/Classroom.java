package Homework10;

import java.util.ArrayList;
import java.util.List;

public class Classroom {
    private ArrayList<StudentGrade> listaStudentiNote;

    public Classroom(ArrayList<StudentGrade> listaStudentiNote) {
        this.listaStudentiNote = listaStudentiNote;
    }

    public List<Integer> getGradesForDiscipline(String discipline){
        List<Integer> result = new ArrayList<>();
        for (StudentGrade st :listaStudentiNote){
            if (st.getDiscipline().equals(discipline)){
                result.add(st.getGrade());
            }

        }
        return result;
    }

    public List<Integer> getGradesForStudent(String student){
        List<Integer> result = new ArrayList<>();
        for (StudentGrade st :listaStudentiNote){
            if (st.getName().equals(student)){
                result.add(st.getGrade());
            }

        }
        return result;
    }

    public StudentGrade getMaxGrade(String discipline){
        StudentGrade sg= new StudentGrade(null,null,0);
        for (StudentGrade s :listaStudentiNote){
            if (discipline != null && s.getDiscipline().equals(discipline)){
                if (s.getGrade() > sg.getGrade()) {
                    sg.setName(s.getName());
                    sg.setDiscipline(s.getDiscipline());
                    sg.setGrade(s.getGrade());
                }
            }
        }
        return sg;
    }


    public StudentGrade getMaxGrade(){
        StudentGrade sg= new StudentGrade(null,null,0);
        for (StudentGrade s :listaStudentiNote){

                if (s.getGrade() > sg.getGrade()) {
                    sg.setName(s.getName());
                    sg.setDiscipline(s.getDiscipline());
                    sg.setGrade(s.getGrade());
                }
        }
        return sg;
    }

    public Integer getAverageGrade(String discipline){
        Integer sum = 0;
        Integer count =0;
        for (StudentGrade s :listaStudentiNote){
            if (s.getDiscipline().equals(discipline)) {
                sum += s.getGrade();
                count++;
            }
        }
        return sum/count;
    }
}
