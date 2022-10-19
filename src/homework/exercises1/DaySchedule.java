package homework.exercises1;

import java.util.ArrayList;
import java.util.List;
//2) create an object that represents a Day Schedule. It will have the day (the enum) and a list of activities (Strings)
public class DaySchedule {
    private DaysOfWeek zi;
    private List<String> listActivities= new ArrayList<>();

    public DaySchedule(DaysOfWeek zi, List<String> listActivities) {
        this.zi = zi;
        this.listActivities = listActivities;
    }

    public DaysOfWeek getZi() {
        return zi;
    }

    public List<String> getListActivities() {
        return listActivities;
    }

    @Override
    public String toString() {
        return "DaySchedule{" +
                "zi=" + zi +
                ", listActivities=" + listActivities +
                '}';
    }
}
