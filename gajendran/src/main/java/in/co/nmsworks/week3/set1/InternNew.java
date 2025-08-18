package in.co.nmsworks.week3.set1;

public class InternNew {

    private static int countIntern = 0;
    private String dept;
    private String name;

    public InternNew(String dept, String name) {
        this.dept = dept;
        this.name = name;
        countIntern++;
    }

    public String getDept() {
        return dept;
    }
}
