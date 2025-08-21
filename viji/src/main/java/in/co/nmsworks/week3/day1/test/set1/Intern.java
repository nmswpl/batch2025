package in.co.nmsworks.week3.day1.test.set1;

public class Intern {
    private String name;
    private double salary ;
    private String department ;

    Intern(){

    }

    public Intern(String name, String department) {
        this.department = department;
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Intern(String name, double salary) {
        this.name = name;
        this.salary = salary;

    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public double getSalary() {

        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Intern{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", department='" + department + '\'' +
                '}';
    }




}
