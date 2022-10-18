package homework.exercises1;

import java.util.*;

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
            throw new NoActivityException("N-ati trimis activitatea");
        }
        this.planZilnic.add(new DaySchedule(day,new ArrayList<String>(Collections.singleton(activity))));
    }

    public void removeActivity(DaysOfWeek day, String activity){
//        Iterator<DaySchedule> i this.planZilnic.iterator();
    }

    @Override
    public String toString() {
        return "DailyPlanner{" +
                "planZilnic=" + planZilnic +
                '}';
    }
}
