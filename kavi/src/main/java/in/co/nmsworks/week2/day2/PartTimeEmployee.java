package in.co.nmsworks.week2.day2;

public class PartTimeEmployee extends Employee {
    int days=30;
    int hours=4;
    int basepay=5;

    public PartTimeEmployee(){

    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public int getBasepay() {
        return basepay;
    }

    public void setBasepay(int basepay) {
        this.basepay = basepay;
    }

    public PartTimeEmployee(int days, int hours, int basepay) {
        this.days = days;
        this.hours = hours;
        this.basepay = basepay;
    }

    @Override
    public String toString() {
        return "PartTimeEmployee{" +
                "days=" + days +
                ", hours=" + hours +
                ", basepay=" + basepay +
                '}';
    }
}
