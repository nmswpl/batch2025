package in.co.nmsworks.week2.day4;

public class Employee {
    private String name;
    private double salaryPerMonth;

    public Employee() {
    }

    public Employee(String name, double salaryPerMonth) {
        this.name = name;
        this.salaryPerMonth = salaryPerMonth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalaryPerMonth() {
        return salaryPerMonth;
    }

    public void setSalaryPerMonth(double salaryPerMonth) {
        this.salaryPerMonth = salaryPerMonth;
    }

    public double annualSalary(){
        return 12 * salaryPerMonth;
    }
}
