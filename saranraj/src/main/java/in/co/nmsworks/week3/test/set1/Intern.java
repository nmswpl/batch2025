package in.co.nmsworks.week3.test.set1;

public class Intern {
    private String name;
    private String department;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Intern(String name, String department) {
        this.name = name;
        this.department = department;
    }
}
