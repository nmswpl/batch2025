package in.co.nmsworks.week2.day2;

public class FullTimeEmployee extends Employee
{
    public FullTimeEmployee()
    {}

    public FullTimeEmployee(int id, String name, String email, String dept, Salary salary)
    {
        super.setId(id);
        super.setName(name);
        super.setEmail(email);
        super.setDept(dept);
        super.setSalary(salary);
    }

}
