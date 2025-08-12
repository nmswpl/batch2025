package in.co.nmsworks.week2.day2;

public class PartTimeEmployee extends Employee{
    int hours = 4;
    int basepay = 5;
    int days = 30;
    double salary=hours * basepay * days;
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

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public void calculateSalaray() {
        System.out.println("Part time employee salary: "+salary);

    }
}
