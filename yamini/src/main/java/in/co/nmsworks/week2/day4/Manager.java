package in.co.nmsworks.week2.day4;

 public class Manager extends Employee {
    private double bonus;



    public Manager(String name,double bonus) {
        this.bonus = bonus;

    }

    public double annualSalary(double salaryPerMonth) {
        return super.annualSalary(salaryPerMonth) + bonus ;
    }
}
