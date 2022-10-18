package homework.exercises1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class DailyPlanner {
    private List<DaySchedule> planZilnic = new ArrayList<>();

    //constructor
//    public DailyPlanner(List<DaySchedule> planZilnic) {
//        this.planZilnic = planZilnic;
//    }

   //4) add functionality to the DailyPlanner:
    //addActivity(day, activity),   - if the activity is null throw a custom UNCHECKED exception: NoActivityException
    public void addActivity(DaysOfWeek day, String activity){
        if(activity ==null){
            throw new RuntimeException();
        }
        this.planZilnic.add(new DaySchedule(day,new ArrayList<String>(Collections.singleton(activity))));
    }

    @Override
    public String toString() {
        return "DailyPlanner{" +
                "planZilnic=" + planZilnic +
                '}';
    }
}
