package in.co.nmsworks.week2.exam.set2;

public class Intern {

    private String name;
    private int salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Intern() {
    }

    public Intern(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Intern{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
