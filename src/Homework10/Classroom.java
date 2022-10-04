package Homework10;

import java.util.ArrayList;
import java.util.List;

public class Classroom {
    private ArrayList<StudentGrade> listaStudentiNote;

    public Classroom(ArrayList<StudentGrade> listaStudentiNote) {
        this.listaStudentiNote = listaStudentiNote;
    }

    //intoarce lista note la o materie
    public List<Integer> getGradesForDiscipline(String discipline){
        List<Integer> result = new ArrayList<>();
        for (StudentGrade st :listaStudentiNote){
            if (st.getDiscipline().equals(discipline)){
                result.add(st.getGrade());
            }

        }
        return result;
    }

    //intoarce lista note per student
    public List<Integer> getGradesForStudent(String student){
        List<Integer> result = new ArrayList<>();
        for (StudentGrade st :listaStudentiNote){
            if (st.getName().equals(student)){
                result.add(st.getGrade());
            }

        }
        return result;
    }

    //intoarce  student si nota max  /materie
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

//intoarce student si nota max/ clasa
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

    //intoarce nota medie /disciplina
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

    // intoarce 1 student cu nota cea mai proasta /materie
    public StudentGrade getWorstGrade(String discipline){
        StudentGrade sg= new StudentGrade(null,null,11);
        for (StudentGrade s :listaStudentiNote){
            if (discipline != null && s.getDiscipline().equals(discipline)){
                if (s.getGrade() < sg.getGrade()) {
                    sg.setName(s.getName());
                    sg.setDiscipline(s.getDiscipline());
                    sg.setGrade(s.getGrade());
                }
            }
        }
        return sg;
    }

    //nota min/materie
    private Integer getMinGrade(String discipline){
        Integer notaMin = 11;
        for (StudentGrade s : listaStudentiNote){
            if (discipline !=null && s.getDiscipline().equals(discipline)){
                if (s.getGrade() < notaMin){
                    notaMin = s.getGrade();
                }
            }

        }
        return notaMin;
    }

    //lista de n stud cu cele mai mici note la o materie
    public List<StudentGrade> getWorstGrade2(String discipline){
        Integer notaMin = getMinGrade(discipline);
        List<StudentGrade> lista= new ArrayList<StudentGrade>();
        for (StudentGrade s :listaStudentiNote){
            if (discipline != null && s.getDiscipline().equals(discipline)){
                if (s.getGrade() == notaMin) {
                    lista.add(s);
                }
            }
        }
        return lista;
    }




}
