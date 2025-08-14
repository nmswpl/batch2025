package in.co.nmsworks.week2.day4;

public class Manager extends Employee{

    double bonus;

    public Manager() {

    }

    public Manager(double bonus) {
        this.bonus = bonus;
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
