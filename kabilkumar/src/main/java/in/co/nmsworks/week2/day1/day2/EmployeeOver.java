package in.co.nmsworks.week2.day1.day2;

public class EmployeeOver
{
    public void work()
    {
        System.out.println("Employee working");
    }
}

class Manager extends EmployeeOver
{
    @Override
    public void work() {

        System.out.println("Manager is an employee");
    }
}

class Developer extends Manager
{
    @Override
    public void work() {

        System.out.println("Developer is an employee");
    }
}

