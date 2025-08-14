package in.co.nmsworks.weeks.day4;

public class Manager extends Employee{
    private double bonus;

    public Manager(String name, double salaryPerMonth, double bonus) {
        super(name, salaryPerMonth);
        this.bonus = bonus;
    }

    @Override
    public double annualSalary() {
        return super.annualSalary() + bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

}