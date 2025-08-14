package in.co.nmsworks.week2.day4;

public class Manager extends Employee{
    private String name;
    private double salaryPerMonth;
    private double bonus;

    public Manager(String name, double salaryPerMonth, double bonus) {
        super(name, salaryPerMonth);
        this.name = name;
        this.salaryPerMonth = salaryPerMonth;
        this.bonus = bonus;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public double getSalaryPerMonth() {
        return salaryPerMonth;
    }

    @Override
    public void setSalaryPerMonth(double salaryPerMonth) {
        this.salaryPerMonth = salaryPerMonth;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public double annualSalary() {
        return bonus + super.annualSalary();
    }
}
