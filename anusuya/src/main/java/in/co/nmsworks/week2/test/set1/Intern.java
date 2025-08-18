package in.co.nmsworks.week2.test.set1;

public class Intern {

    private String name;
    private String dept;

    public Intern() {}

    public Intern(String name, String dept){
        this.name = name;
        this.dept = dept;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public String getDept() {
        return dept;
    }
}
