package in.co.nmsworks.week2.day2;

public class Runner {

    public static void main(String[] args) {
        Contractor c1 = new Contractor();
        c1.setHours(5);
        System.out.println("Contractor Salary : " + c1.calculateSalary(c1.getHours(), c1.basePay));

        FullTimeEmployee f1 = new FullTimeEmployee();
        System.out.println("Full Time Employee Salary : " + f1.calculateSalary(f1.hours, f1.basePay));

        PartTimeEmployee p1 = new PartTimeEmployee();
        System.out.println("Part Time Employee Salary : " + p1.calculateSalary(p1.hours, p1.basePay));
    }
}
