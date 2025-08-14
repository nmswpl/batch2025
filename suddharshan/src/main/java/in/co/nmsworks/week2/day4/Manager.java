package in.co.nmsworks.week2.day4;

public class Manager extends Employee{
    public double bonus;

    public Manager(String name, double salaryPerMonth, int bonus) {
        super(name, salaryPerMonth);
        this.bonus = bonus;
    }

    public double getAnnualSalary(){
        return super.getAnnualSalary() + bonus;
    }

    public static void main(String[] args) {
        Employee e = new Employee("Hari",30000);
        System.out.println(e.getClass().getSimpleName() + " " + e.name + " "+"Salary is: " + e.getAnnualSalary());
        Manager m = new Manager("Gokul", 35000, 30000);
        System.out.println(m.getClass().getSimpleName() + " " + m.name + " "+ "Salary is: "+ m.getAnnualSalary());
    }
}
