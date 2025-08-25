package in.co.nmsworks.week2.test.set1;

public class Intern
{
    private String name;
    private String dept;
    private int salary;

    public Intern()
    {}

    public Intern(String name, String dept)
    {
        this.name = name;
        this.dept = dept;
    }

    public Intern(String name, String dept, int salary) {
        this.name = name;
        this.dept = dept;
        this.salary = salary;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getDept()
    {
        return dept;
    }

    public void setDept(String dept)
    {
        this.dept = dept;
    }

    public int getSalary()
    {
        return salary;
    }

    public void setSalary(int salary)
    {
        this.salary = salary;
    }
}
