package in.co.nmsworks.week3.day1.exam.set1;

import java.util.Arrays;

public class Intern {
    String name;
    String department;

    public Intern(String name, String department) {
        this.name = name;
        this.department = department;
    }

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

    public static void main(String[] args) {
        Intern i1 = new Intern("Mathi","dev");
        Intern i2 = new Intern("Madan","dev");
        Intern i3 = new Intern("Ram","test");
        Intern i4 = new Intern("kumar","test");
        Intern[] interns = new Intern[]{i1,i2,i3,i4};
        int[] result = printIndices(interns,"test");
        System.out.println(Arrays.toString(result));

    }

    private static int[] printIndices(Intern[] interns, String dept) {
        int count = 0;
        for (int i=0;i< interns.length;i++)
        {
            if(dept.equals(interns[i].department))
            {
                count++;
            }
        }
        int arr[] = new int[count];
        int k = 0;
        for (int i=0;i< interns.length;i++)
        {
            if(dept.equals(interns[i].department))
            {
                arr[k++]=i;
            }
        }
        return arr;
    }


}
