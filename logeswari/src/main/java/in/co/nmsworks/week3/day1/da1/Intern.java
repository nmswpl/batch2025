package in.co.nmsworks.week3.day1.da1;

public class Intern {
    public String name;
    public String dept;

    public Intern(String name,String dept){

        this.name=name;
        this.dept=dept;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    @Override
    public String toString() {
        return "Intern{" +
                "name='" + name + '\'' +
                ", dept='" + dept + '\'' +
                '}';
    }
}
