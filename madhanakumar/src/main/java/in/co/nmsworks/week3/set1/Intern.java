package in.co.nmsworks.week3.set1;

public class Intern {
    private String name;
    private String dept;

    public Intern(String dept, String name) {
        this.dept = dept;
        this.name = name;
    }

    public Intern() {
        // Default constructor
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
                "name='" + name + '\'' +
                ", dept='" + dept + '\'' +
                '}';
    }

    public int[] getIndicesByDept(Intern[] interns, String targetDept) {
        // First pass: count matches
        int count = 0;
        for (int i = 0; i < interns.length; i++) {
            if (interns[i].getDept().equalsIgnoreCase(targetDept)) {
                count++;
            }
        }

        int[] result = new int[count];
        int index = 0;
        for (int i = 0; i < interns.length; i++) {
            if (interns[i].getDept().equalsIgnoreCase(targetDept)) {
                result[index++] = i;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Intern i1 = new Intern("CSE", "Madhan");
        Intern i2 = new Intern("IT", "Kangu");
        Intern i3 = new Intern("CSE", "Mathi");
        Intern i4 = new Intern("IT", "Vinayagam");
        Intern i5 = new Intern("CSE", "Vimal");
        Intern[] interns = {i1, i2, i3, i4, i5};
        Intern intern = new Intern();
        int[] cseIndices = intern.getIndicesByDept(interns, "CSE");
        System.out.print("Indices of interns in CSE: ");
        for (int index : cseIndices) {
            System.out.print(index + " ");
        }
    }
}
