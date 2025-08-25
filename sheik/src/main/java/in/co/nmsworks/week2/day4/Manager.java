package in.co.nmsworks.week2.day4;
/*
public class Manager implements EmployeeAndManager
{

    double monsalary;
    int bonus = 2000;

    public Manager(double monsalary) {
        this.monsalary = monsalary;
    }
    @Override
    public double annualSalary() {
        System.out.println("Manager Annual Salary");
        return 12 * monsalary + bonus;
    }
}
*/

public class Manager extends Employee
{
    private String name;
    private double monSalary;
    int bonus;

    public Manager(String name, double monSalary, int bonus) {
        super(name, monSalary);
        this.name = name;
        this.monSalary = monSalary;
        this.bonus = bonus;
    }


    public double annualSalary(){
        System.out.println("Manager salary");
        return super.annualSalary() + bonus;
   }
}
