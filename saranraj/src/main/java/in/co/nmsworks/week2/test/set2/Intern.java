package in.co.nmsworks.week2.test.set2;

public class Intern {
    private String name;
    private int Salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return Salary;
    }

    public void setSalary(int salary) {
        Salary = salary;
    }


    public Intern(String name, int salary) {
        this.name = name;
        Salary = salary;
    }


}
