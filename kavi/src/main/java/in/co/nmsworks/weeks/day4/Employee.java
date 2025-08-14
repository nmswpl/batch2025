package in.co.nmsworks.weeks.day4;

public class Employee {
    protected String name;
    protected double salaryPerMonth;

    public Employee(String name, double salaryPerMonth) {
        this.name = name;
        this.salaryPerMonth = salaryPerMonth;
    }

    //@Override
    public double annualSalary() {
        return salaryPerMonth * 12;
    }

    public String getName() {
        return name;
    }

}
