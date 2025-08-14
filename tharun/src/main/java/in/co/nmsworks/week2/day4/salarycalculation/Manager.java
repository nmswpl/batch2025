package in.co.nmsworks.week2.day4.salarycalculation;

public class Manager extends Employee{

    double bonus =0 ;

    public Manager(String name, double salaryPerMonth) {
        super(name, salaryPerMonth);
    }

    public Manager(String name, double salaryPerMonth, double bonus) {
        super(name, salaryPerMonth);
        this.bonus = bonus;
    }

    @Override
    public double annualSalary() {
        if (bonus > 0){
            return super.annualSalary() + bonus;
        }
        return super.annualSalary();
    }
}
