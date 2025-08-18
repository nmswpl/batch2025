package in.co.nmsworks.week2.exam.set2;

public class Intern {
    private String name;
    private double salary ;

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

    Intern(){

    }

    @Override
    public String toString() {
        return "Intern{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
