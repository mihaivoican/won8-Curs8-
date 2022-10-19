package homework.exercises1;

public class Main {
    public static void main(String[] args) {
        DailyPlanner dp = new DailyPlanner();

        //adaug activitati
        dp.addActivity(DaysOfWeek.LUNI, "mate");
        dp.addActivity(DaysOfWeek.LUNI, "chimie");
        dp.addActivity(DaysOfWeek.MARTI, "sport");
        dp.addActivity(DaysOfWeek.MIERCURI, "MATE");
        dp.addActivity(DaysOfWeek.MARTI, "romana");
        dp.addActivity(DaysOfWeek.MARTI, "romana");

        System.out.println(dp);

        //provoc eroarea
//        dp.addActivity(DaysOfWeek.MIERCURI,null);

        //sterg ACTIVITATE
        dp.removeActivity(DaysOfWeek.MARTI, "romana");
        System.out.println(dp);
//fortez eroarea
        dp.removeActivity(DaysOfWeek.MARTI, "romina");
        System.out.println(dp);




    }
}
