package in.co.nmsworks.week2.day4;

public class EmployeeRunner
{
    public static void main(String[] args)
    {

        Manager manager = new Manager("Ranjith", 40000, 80000);
        Employee employee = new Employee("Rajini", 35000);

        printEmployeeDetails(manager);
        printEmployeeDetails(employee);

    }

    public static void printEmployeeDetails(Employee employee)
    {
        if(employee instanceof Manager)
        {
            Manager manager = (Manager) employee;
            System.out.println("Annual Salary for Manager : " + manager.annualSalary());
        }
        else
        {
            System.out.println("Annual Salary for Employee : " + employee.annualSalary());
        }
    }
}
