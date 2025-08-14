package in.co.nmsworks.week2.day4;

public class Employee {
    String name;
    double salaryPerMonth;

    public Employee(String name, double salaryPerMonth) {
        this.name = name;
        this.salaryPerMonth = salaryPerMonth;
    }
    
    public double calculateSalary() {
        return salaryPerMonth * 12;
    }
}
