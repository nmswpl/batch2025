package in.co.nmsworks.week2.day2;

public class Contractor extends Employee{
    int hours = 2;
    int basepay;
    int days;

    public Contractor(int basepay, int days)
    {
        this.basepay = basepay;
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
    double salary=hours * basepay * days;

    public void calculateSalaray() {
        System.out.println("Contractor Salary: "+salary);
    }
}
