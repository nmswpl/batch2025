package in.co.nmsworks.week2.day4;

public class Manager extends Employee{
    double bonus;

    public Manager(String name, double salaryPerMonth, double bonus) {
        super(name,salaryPerMonth);
        this.bonus = bonus;
    }

    @Override
    public double calculateSalary() {
        return super.calculateSalary() + bonus;
    }
}
