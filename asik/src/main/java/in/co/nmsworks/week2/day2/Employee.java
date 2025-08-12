package in.co.nmsworks.week2.day2;

public class Employee
{
    private int id;
    private String name;
    private String email;
    private String dept;
    private Salary salary;

    public Employee()
    {}

    public Employee(int id, String name, String email, String dept, Salary salary) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.dept = dept;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public int calulateSalary() {
        return salary.getNoOfDays()*salary.getBaseSalary()*salary.getWorkingHours();
    }

    public void setSalary(Salary salary) {
        this.salary = salary;
    }


}
