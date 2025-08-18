package in.co.nmsworks.week3.day1.set2;

public class Intern {
    private String name;
    private double salary;

    public Intern() {
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

    public double calculateSalary(){
        return 12 * getSalary();
    }
}
