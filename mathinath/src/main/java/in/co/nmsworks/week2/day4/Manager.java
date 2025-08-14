package in.co.nmsworks.week2.day4;

public class Manager extends Employee{
    public double bonus;

    public Manager(String name, double salaryPerMonth, double bonus) {
        super(name, salaryPerMonth);
        this.bonus = bonus;
    }

    public Manager() {
    }

    public double annualSalary()
    {
        return super.getSalaryPerMonth() * 12 + bonus;
    }

    public static void main(String[] args) {
        Employee e1 = new Employee("Mathi",1000);
        System.out.println("Employee Salary "+name);
        System.out.println(e1.annualSalary());
        Manager m1 = new Manager("madan",10000,100);
        System.out.println("Manager salary "+name);
        System.out.println(m1.annualSalary());

    }
}
