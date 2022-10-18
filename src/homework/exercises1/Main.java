package homework.exercises1;

public class Main {
    public static void main(String[] args) {
        DailyPlanner dp = new DailyPlanner();

        //adaug
        dp.addActivity(DaysOfWeek.LUNI,"mate");
        dp.addActivity(DaysOfWeek.LUNI,"chimie");
        dp.addActivity(DaysOfWeek.MARTI,"sport");
        dp.addActivity(DaysOfWeek.MIERCURI,"MATE");

        System.out.println(dp);

    }
}
