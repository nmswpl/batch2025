package in.co.nmsworks.week2.day2;

public class Employee {
    int hours;
    int days;


    public void setHours(int hours) {
        this.hours = hours;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public int calculateSalary(int hours, int basePay) {
        return hours * basePay;
    }
}

class FullTimeEmployee extends Employee {

    @Override
    public int calculateSalary(int hours, int basePay) {
        return this.getDays() * 24 * (hours * basePay);

    }
}

class PartTimeEmployee extends Employee {
    @Override
    public int calculateSalary(int hours, int basePay) {
        return this.getDays() * 24 * (hours * basePay);
    }
}

class Contractor extends Employee {
    @Override
    public int calculateSalary(int hours, int basePay) {
        return hours * basePay;
    }
}
