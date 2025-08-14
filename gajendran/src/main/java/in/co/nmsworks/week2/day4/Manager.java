package in.co.nmsworks.week2.day4;

public class Manager extends Employee{

    public double bonus;

    public Manager(String name, double salary, double bonus) {
        this.bonus = bonus;
        setNameAndSalary(name, salary);
    }

    @Override
    public double annualSalary() {
        return (super.annualSalary()) + bonus;
    }
}
