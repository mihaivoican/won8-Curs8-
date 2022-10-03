package Homework10;

import java.util.List;

public class StudentGrade {
    private String name;    //nume si prenume
    private String discipline;
    private int grade;

    public StudentGrade(String name, String discipline, int grade) {
        this.name = name;
        this.discipline = discipline;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public String getDiscipline() {
        return discipline;
    }

    public int getGrade() {
        return grade;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDiscipline(String discipline) {
        this.discipline = discipline;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "StudentGrade{" +
                "nume='" + name + '\'' +
                ", disciplina='" + discipline + '\'' +
                ", nota=" + grade +
                '}';
    }
}


