package in.co.nmsworks.week2.day2;

public class Runner {
    public static void main(String[] args) {
        FullTimeEmployee f1=new FullTimeEmployee();
        f1.setDays(30);
        f1.setHours(8);
        System.out.println("Salary of a FullTime Employee: "+f1.calculateSalary(f1.days,10000));
        PartTimeEmployee p1=new PartTimeEmployee();
        p1.setDays(30);
        p1.setHours(4);
        System.out.println("Salary of a PartTime Employee: "+p1.calculateSalary(f1.hours, 5000));
        Contractor c1=new Contractor();
        c1.setHours(5);
        System.out.println(c1.calculateSalary(c1.hours, 3000));
    }
}
