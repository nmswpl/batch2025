package in.co.nmsworks.runner;

public class Employee {

    private int hours;
    private int basePay;

    public int getBasePay() {
        return basePay;
    }

    public void setBasePay(int basePay) {
        this.basePay = basePay;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public void calculateSalary()
    {
        System.out.println(basePay * hours);
    }
}

class Contractor extends Employee {
    public Contractor (int totalHrsWorked) {
        setHours(totalHrsWorked);
        setBasePay(3);
    }

    @Override
    public void setBasePay(int basePay) {
        System.out.println(basePay);
    }
}

class FullTimeEmp extends Employee {

    public FullTimeEmp (int noOfDays, int hrsPerDay) {
        super.setHours(noOfDays * hrsPerDay);
        setBasePay(10);
    }
}

class PTEmp extends Employee {
    public PTEmp(int noOfDays, int hrsPerDay) {
        super.setHours(noOfDays * hrsPerDay);
        setBasePay(5);
    }
}