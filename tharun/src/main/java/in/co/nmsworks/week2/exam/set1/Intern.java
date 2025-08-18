package in.co.nmsworks.week2.exam.set1;

import java.util.Arrays;

public class Intern {
    private String name;
    private String dept;

    public Intern() {
    }

    public Intern(String name, String dept) {
        this.name = name;
        this.dept = dept;
    }

    @Override
    public String toString() {
        return "Intern{" +
                "name='" + name + '\'' +
                ", dept='" + dept + '\'' +
                '}';
    }

    public static int [] departmentIndex(Intern [] internArray,String dept){
        int [] index = new int[internArray.length] ;
        int count =0;
        for (int i =0 ;i < internArray.length ; i++){
            if (dept.equals(internArray[i].dept)){
                System.out.println(i);
                index[count] = i;
                count++;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        Intern tharun = new Intern("Tharun","IT");
        Intern abinesh = new Intern("Abinesh","CSE");
        Intern sathish = new Intern("sathish","IT");

        Intern [] internArray = new Intern []{tharun,abinesh,sathish};

        System.out.println(Arrays.toString(departmentIndex(internArray,"IT")));
    }
}
