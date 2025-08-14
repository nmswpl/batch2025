package in.co.nmsworks.week2.day4;

public class Manager extends Employee{

    double bonus;

    public Manager() {

    }

    public Manager(double bonus) {
        this.bonus = bonus;
    }

    public Manager(String name, double salaryPerMonth, double bonus) {
        super(name, salaryPerMonth);
        this.bonus = bonus;
    }

    @Override
    public String toString() {
        String str = "Manager";
        return str;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double annualSalary() {
        return super.annualSalary() + bonus;
    }




}
