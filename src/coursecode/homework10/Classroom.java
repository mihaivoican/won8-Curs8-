package coursecode.homework10;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Classroom {
    private final List<StudentGrade> grades;

    public Classroom(List<StudentGrade> grades) {
        this.grades = grades;
    }

    public List<Integer> getGradesForDiscipline(String discipline) {
        List<Integer> result = new ArrayList<>();
        for (StudentGrade studentGrade : grades) {
            if (discipline == null || studentGrade.discipline().equalsIgnoreCase(discipline)) {
                result.add(studentGrade.grade());
            }
        }
        return result;
    }

    public Map<String, List<Integer>> getGradesGroupByDiscipline() {
        Map<String, List<Integer>> result = new HashMap<>();
        for (StudentGrade studentGrade : grades) {
            String discipline = studentGrade.discipline();
            if (!result.containsKey(discipline)) {
                result.put(discipline, new ArrayList<>());
            }
            result.get(discipline).add(studentGrade.grade());
        }
        return result;
    }

    public StudentGrade getMaxGrade(String discipline) {
        StudentGrade maxGrade = null;
        for (StudentGrade grade : grades) {
            if ((discipline == null || grade.discipline().equalsIgnoreCase(discipline)) && (maxGrade == null || grade.grade() > maxGrade.grade())) {
                maxGrade = grade;
            }
        }
        return maxGrade;
    }

    public Integer getAverageGrade(String discipline) {
        List<Integer> gradesForDiscipline = getGradesForDiscipline(discipline);
        int sum = 0;
        for (Integer grade : gradesForDiscipline) {
            sum += grade;
        }
        int floorAverage = (int) Math.floor((double) sum / gradesForDiscipline.size()); // 2.3 => 2    2.9 => 2
        int ceilAverage = (int) Math.ceil((double) sum / gradesForDiscipline.size()); // 2.3 => 3    2.9 => 3
        int roundAverage = (int) Math.round((double) sum / gradesForDiscipline.size()); // 2.3 => 2    2.9 => 3
        return roundAverage;
    }

    public static void main(String[] args) {
        Classroom classroom = new Classroom(new ArrayList<>());
        classroom.getGradesForDiscipline(null);

        StudentGrade maxGrade = classroom.getMaxGrade("");
    }
}
