package in.co.nmsworks.week2.day2;

public class Employee {
    int hours;
    int basepay;

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

    public void calculateSalaray() {
        double salary = hours * basepay;
    }
}



