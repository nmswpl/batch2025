package in.co.nmsworks.week2.day4;

public class CalculateAnnualSalary  {
    public static void main(String[] args) {

        Employee employee = new Employee();
        employee.setName("viji");
        employee.setSalaryPerMonth(200.00);
        System.out.println("Employee Salary : " + employee.annualSalary());

        Employee e1 = new Manager();
        e1.setName("Yamini");
        e1.setSalaryPerMonth(2000.00);
        System.out.println("Manager Salary : " + e1.annualSalary());

    }
}
