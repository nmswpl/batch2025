package in.co.nmsworks.week2.day4.salarycalculation;

public class Employee {
    private String name;
    private double salaryPerMonth;

    public Employee(String name, double salaryPerMonth) {
        this.name = name;
        this.salaryPerMonth = salaryPerMonth;
    }

    public double annualSalary(){
        return salaryPerMonth * 12;
    }
}
