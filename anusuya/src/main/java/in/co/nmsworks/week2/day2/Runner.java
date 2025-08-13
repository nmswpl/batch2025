package in.co.nmsworks.week2.day2;

public class Runner {

    public static void main(String[] args) {
        Contractor c1 = new Contractor();
        c1.setNoOfWorkingHours(30);
        c1.setBasePay(3);
        System.out.println("Contractor Salary : $ " + c1.calculateSalary());

        FullTimeEmployee f1 = new FullTimeEmployee();
        //f1.setNoOfWorkingHours(8); We can also custom working hours
        f1.setNoOfWorkingDays(30);
        f1.setBasePay(10);
        System.out.println("Full Time Employee Salary : $ " + f1.calculateSalary());

        PartTimeEmployee p1 = new PartTimeEmployee();
        //p1.setNoOfWorkingHours(4);
        p1.setNoOfWorkingDays(20);
        p1.setBasePay(5);
        System.out.println("Part Time Employee Salary : $ " + p1.calculateSalary());

    }
}
