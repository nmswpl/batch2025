package in.co.nmsworks.week2.day4;
/*
public class Employee implements EmployeeAndManager
{

    String name;
    double monsalary;

    public Employee(double monsalary) {
        System.out.println("Employee Annual Salary");
        this.monsalary = monsalary;
    }

    @Override
    public double annualSalary() {
        return 12 * monsalary;
    }
}
*/

public class Employee
{
    private String name;
    private double monSalary;

    public Employee() {
    }

    public Employee(String name, double monSalary) {
        this.name = name;
        this.monSalary = monSalary;
    }

    public double annualSalary(){
        return 12 * monSalary;
    }
}