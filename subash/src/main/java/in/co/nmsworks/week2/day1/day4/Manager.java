package in.co.nmsworks.week2.day1.day4;

public class Manager extends Employee{

    private double bonus;

    public Manager(String name, double salary,double bonus) {
        super(name, salary);
        this.bonus=bonus;
    }

    @Override
    public double annualSalary() {
        return super.annualSalary()+ bonus;
    }
}
