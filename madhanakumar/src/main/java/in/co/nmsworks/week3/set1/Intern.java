package in.co.nmsworks.week3.set1;

public class Intern {
    private String name;
    private String dept;

    public Intern(String dept, String name) {
        this.dept = dept;
        this.name = name;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Intern{" +
                ", name='" + name + '\'' +
                "dept='" + dept + '\'' +
                '}';
    }
}

class TestRunner{
    static void main(String[] args) {
        Intern i1 = new Intern("CSE","Madhan");
        Intern i2 = new Intern("IT","Kangu");
        Intern i3 = new Intern("CSE","Mathi");
        Intern i4 = new Intern("IT","Vinayagam");
        Intern i5 = new Intern("CSE","Vimal");

        Intern[] interns = {i1,i2,i3,i4,i5};

        getIndicies(interns);

    }

    private static int[] getIndicies(Intern[] interns) {
        int[] a = new int[interns.length];
        for (int i = 0; i < interns.length; i++) {

        }
        return a;
    }

    public static void filterDept(){

    }
}
