package in.co.nmsworks.week3.day1.exam.set1;

import java.util.Arrays;

public class InternSet1 {

private String name;
private String dept;

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

    public InternSet1(String name, String dept) {
        this.name = name;
        this.dept = dept;
    }

    public InternSet1() {
    }

    @Override
    public String toString() {
        return "InternSet1{" +
                "name='" + name + '\'' +
                ", dept='" + dept + '\'' +
                '}';
    }

    public static void main(String[] args) {


        InternSet1 internSet1=new InternSet1("Abishek","Developer");
        InternSet1 internSet2=new InternSet1("Deepak","QA");
        InternSet1 internSet3=new InternSet1("Siva","Developer");
        InternSet1 internSet4=new InternSet1("Kasim","QA");
        InternSet1 internSet1Array[]=new InternSet1[]{internSet1,internSet2,internSet3,internSet4};
        int arr[]=findDepartment(internSet1Array,"QA");

        System.out.println(Arrays.toString(arr));


    }
    private static int[] findDepartment(InternSet1[] internSet1Array,String dept)
    {
        int count=0;
        for (int i = 0; i < internSet1Array.length; i++)
        {
            if(internSet1Array[i].getDept().equals(dept))
                count++;
        }
        int arr[]=new int[count];
        int index=0;
        for (int i = 0; i < internSet1Array.length; i++)
        {
            if(internSet1Array[i].getDept().equals(dept))
                arr[index++]=i;
        }
        System.out.println("Index position of "+dept);
        return arr;
    }
}
