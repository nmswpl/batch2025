package in.co.nmsworks.week2.day4;

public class Manager extends Employee{

    private double bonus;

    public Manager(){
    }

    public Manager(String name, double salaryPerMonth, double bonus){
        super.setName(name);
        super.setSalaryPerMonth(salaryPerMonth);
        this.bonus = bonus;
    }

    @Override
    public double annualSalary() {
        return super.annualSalary() + bonus;
    }
}
