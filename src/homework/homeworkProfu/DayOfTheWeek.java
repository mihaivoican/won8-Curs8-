package homework.homeworkProfu;

public enum DayOfTheWeek {
    MONDAY(1), TUESDAY(2), WEDNESDAY(3), THURSDAY(4), FRIDAY(5), SATURDAY(6), SUNDAY(7);

    private int number; //suplimentar; nu era nevoie de ac fielsd in tema

    DayOfTheWeek(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }
}
