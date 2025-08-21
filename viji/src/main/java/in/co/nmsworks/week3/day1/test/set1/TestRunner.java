package in.co.nmsworks.week3.day1.test.set1;

import java.util.Arrays;

public class TestRunner {

    public static void main(String[] args) {

        Intern viji = new Intern("Viji" , "cse");
        Intern yamini = new Intern("Yamini" , "It");
        Intern maha = new Intern("maha" , "cse");
        Intern kavi = new Intern("kavi" , "cse");
        Intern anushya = new Intern("anushya" , "It");

        Intern[] interns ={viji , yamini , maha , kavi , anushya };
        int[] answer = getIndicesByDepartment(interns,"cse");

        System.out.print(Arrays.toString(answer));

    }
    public static int[] getIndicesByDepartment(Intern[] interns,String dept){
        int count = 0;
        for(int i=0 ; i< interns.length ; i++){
            if(interns[i].getDepartment().equals(dept)){
                count++;
            }
        }
        int[] array = new int[count];
        int j = 0;
        for(int i =0 ; i< interns.length ; i++){
            if(interns[i].getDepartment().equals(dept)){
                array[j++]= i ;
            }
        }
        return array ;
    }
}
