package in.co.nmsworks.week3.set1;

public class InternNew {

    private String dept;
    private String name;

    @Override
    public String toString() {
        return "InternNew{" +
                "dept='" + dept + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    public InternNew(String dept, String name) {
        this.dept = dept;
        this.name = name;
    }

    public String getDept() {
        return dept;
    }
}
