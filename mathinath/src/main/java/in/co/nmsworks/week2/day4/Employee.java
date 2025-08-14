package in.co.nmsworks.week2.day4;

public class Employee {
    static String name;
    double salaryPerMonth;

    public Employee() {
    }

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        Employee.name = name;
    }

    public double getSalaryPerMonth() {
        return salaryPerMonth;
    }

    public void setSalaryPerMonth(double salaryPerMonth) {
        this.salaryPerMonth = salaryPerMonth;
    }

    public Employee(String name, double salaryPerMonth) {
        this.name = name;
        this.salaryPerMonth = salaryPerMonth;
    }

    public double annualSalary()
    {
        return salaryPerMonth * 12 ;

    }
}
