package in.co.nmsworks.week2.day2;

public class FullTimeEmployee extends Employee {
    private int days = 30;

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public static int calculateTotalHours(int days, int hours) {
        return days * hours;
    }

}
