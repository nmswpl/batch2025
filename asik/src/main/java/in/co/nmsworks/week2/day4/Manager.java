package in.co.nmsworks.week2.day4;

public class Manager extends Employee
{
    private int bonus;

    public Manager()
    {}

    public Manager(String name, double salaryPerMonth , int bonus)
    {
        this.setName(name);
        this.setSalaryPerMonth(salaryPerMonth);
        this.bonus = bonus;
    }

    public int getBonus()
    {
        return bonus;
    }

    public void setBonus(int bonus)
    {
        this.bonus = bonus;
    }

    public double annualSalary()
    {
        return (getSalaryPerMonth() * 12) + bonus;
    }
}
