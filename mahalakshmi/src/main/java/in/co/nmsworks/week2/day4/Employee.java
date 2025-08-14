package in.co.nmsworks.week2.day4;

public class Employee {

    private String name;
    private double salaryPerMonth;

    public Employee(String name, double salaryPerMonth) {
        this.name = name;
        this.salaryPerMonth = salaryPerMonth;
    }

    public double annualSalary() {
        return salaryPerMonth * 12;
    }

    public static void main(String[] args) {
        Employee em1 = new Employee("John",30000);
        System.out.println(em1.annualSalary());

        Employee em2 = new Manager("Smith",40000,15000);
        System.out.println(em2.annualSalary());
    }
}
