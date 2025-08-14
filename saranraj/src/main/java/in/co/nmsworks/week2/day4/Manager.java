package in.co.nmsworks.week2.day4;

class Employee {
    private String name;
    private double salaryPerMonth;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalaryPerMonth() {
        return salaryPerMonth;
    }

    public void setSalaryPerMonth(double salaryPerMonth) {
        this.salaryPerMonth = salaryPerMonth;
    }

    public Employee(String name, double salaryPerMonth) {
        this.name = name;
        this.salaryPerMonth = salaryPerMonth;
    }


    public double annualSalary() {
        return salaryPerMonth * 12;

    }
}


public class Manager extends Employee{
    private int bonus;

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    public Manager(String name, double salaryPerMonth, int bonus) {
        super(name, salaryPerMonth);
        this.bonus = bonus;
    }


    @Override
    public double annualSalary() {
        return super.annualSalary() + bonus;

    }

    public static void main(String[] args) {

      Employee employee = new Employee("saran",10000);
      System.out.println(employee.annualSalary());
      Manager manager = new Manager("qwerty",10000,5000);
      System.out.println(manager.annualSalary());
    }

}
