package homework.homeworkProfu;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DailyPlanner {
    private List<DaySchedule> scheduleList = new ArrayList<>();


    //metoda de adaugare zi si activitate
    public void addActivity(DayOfTheWeek day, String activity) {
        validateActivity(activity);     //vezi mai jos metoda; verif daca param e nuu
        DaySchedule found = getDaySchedule(day);        //vezi mai jos metoda; caut ziua din param  in lista
        if (found == null) {    //nu s-a gasit
            //adaug ziua din param + lista activit; se foloseste singletone fiindca aici am numai 1 activit in loc de o lista de activ
            scheduleList.add(new DaySchedule(day, new ArrayList<>(Collections.singletonList(activity))));
        } else {
            //adaug doar activitatea la lista zilei deja existenta
            found.getActivities().add(activity);
        }
    }

    public void removeActivity(DayOfTheWeek day, String activityToBeRemoved) {
        validateActivity(activityToBeRemoved);      //validez sa nu fie null parametrul zi; daca e null arunc except si ies
        DaySchedule daySchedule = getDaySchedule(day);      //gasim ziua
        if (daySchedule == null) {
            //daca nu exista arunc exceptie
            throw new NoActivityException();
        } else {
            boolean wasRemoved = removeActivityFromDay(activityToBeRemoved, daySchedule);
            if (!wasRemoved) {
                //n-a gasit activitatea in planul zilei
                throw new NoActivityException();
            }
        }
    }

    public Map<DayOfTheWeek, List<String>> endPlanning() throws NoActivitiesForDayException {
        Map<DayOfTheWeek, List<String>> result = new HashMap<>();
        DayOfTheWeek[] days = DayOfTheWeek.values();        //asa obtin toate vslorine din enum intr-un array
        for (DayOfTheWeek day : days) {
            DaySchedule daySchedule = getDaySchedule(day);
            if (daySchedule == null || daySchedule.getActivities().size() == 0) {
                throw new NoActivitiesForDayException();        //arunc o noua exceptie checked; vezi si la semnatura metodei
            }
            result.put(day, daySchedule.getActivities());
        }
        return result;
    }

    //metoda ajutatoare; declarata privata; se foloseste doar in ac cls; verifica daca activit e nula si arunca o exceptie
    private void validateActivity(String activity) {
        if (activity == null) {
            throw new NoActivityException();
        }
    }

    //metoda ajutatoare
    private boolean removeActivityFromDay(String activityToBeRemoved, DaySchedule daySchedule) {
        for (String activity : daySchedule.getActivities()) {
            if (activity.equals(activityToBeRemoved)) {
                daySchedule.getActivities().remove(activity);
                return true;
            }
        }
        return false;
    }

    //metoda ajutatoare; cauta ziua (programul zilei: zi+activitati)
    private DaySchedule getDaySchedule(DayOfTheWeek day) {
        for (DaySchedule daySchedule : scheduleList) {
            if (daySchedule.getDay() == day) {      //se poate cauta cu == fiindca am enum pe zi
                return daySchedule;
            }
        }
        return null;
    }
}
