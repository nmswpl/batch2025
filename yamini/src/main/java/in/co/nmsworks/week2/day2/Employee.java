package in.co.nmsworks.week2.day2;

public class Employee {
    int hours;

    public void setHours(int hours) {
        this.hours = hours;
    }



    public int calculateSalary(int hours, int basePay) {

        return hours * basePay;
    }
}

class FullTimeEmployee extends Employee {
    int days;
    public int getDays() {

        return days;
    }

    public void setDays(int days) {

        this.days = days;
    }
    @Override
    public int calculateSalary(int hours, int basePay) {
        return this.getDays() *this.hours *basePay;

    }
}

class PartTimeEmployee extends Employee {
    int days;
    public int getDays() {

        return days;
    }

    public void setDays(int days) {

        this.days = days;
    }
    @Override
    public int calculateSalary(int hours, int basePay) {

        return this.getDays() * this.hours * basePay;
    }
}

class Contractor extends Employee {
    @Override
    public int calculateSalary(int hours, int basePay) {
        return hours * basePay;
    }
}
