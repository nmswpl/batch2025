package in.co.nmsworks.week2.day4;

public class Employee {
    public String name;
    public double salaryPerMonth;

    public Employee(String name, double salaryPerMonth) {
        this.name = name;
        this.salaryPerMonth = salaryPerMonth;
    }

    public double getAnnualSalary(){
        return 12 * salaryPerMonth;
    }
}
