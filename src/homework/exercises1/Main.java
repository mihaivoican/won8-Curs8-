package homework.exercises1;

public class Main {
    public static void main(String[] args) {
        DailyPlanner dp = new DailyPlanner();

        //adaug activitati
        dp.addActivity(DaysOfWeek.LUNI,"mate");
        dp.addActivity(DaysOfWeek.LUNI,"chimie");
        dp.addActivity(DaysOfWeek.MARTI,"sport");
        dp.addActivity(DaysOfWeek.MIERCURI,"MATE");

        System.out.println(dp);

        //provoc erarea
        dp.addActivity(DaysOfWeek.MIERCURI,null);





    }
}
