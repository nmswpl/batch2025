package in.co.nmsworks.week2.day4;

public class Employee {
    String name;
    private double salaryPerMonth;

    public double annualSalary(double salaryPerMonth) {
        return salaryPerMonth * 12 ;
    }
    public Employee(){

    }

    public Employee(String name) {
        this.name = name;
    }
}

