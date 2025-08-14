package in.co.nmsworks.week2.day4;

public class SalaryCalculator {
    public static void main(String[] args) {
        Employee e1 = new Employee("Madhan",21000.0D);
        calcSalary(e1);
        Manager m1 = new Manager(e1.name, e1.salaryPerMonth, 1000.0D);
        calcSalary(m1);
    }

    private static void calcSalary(Employee e) {
        if (e instanceof Employee e1)
            System.out.println("Annual Salary for Employee : " +e1.calculateSalary());
        else if (e instanceof Manager m1) {
            System.out.println("Annual Salary for Manager : "+ m1.calculateSalary());
        }
    }
}
