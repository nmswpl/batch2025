package in.co.nmsworks.week3.day1.test.set2;

import in.co.nmsworks.week2.test.set1.Intern;

import java.util.Arrays;

public class Launch {

    public static void main(String[] args) {
        Intern i1=new Intern("Vijay",20000);
        Intern i2=new Intern("Arjun",34000);
        Intern i3=new Intern("Suji",23000);
        Intern i4=new Intern("Deepa",22000);
        Intern i5=new Intern("Mano",21000);
        Intern i6=new Intern("Santhosh",25000);

        Intern[]array={i1,i2,i3,i4,i5,i6};
        calculateAverage(array);

        System.out.println(Arrays.toString(result("Java is Object Oriented programming language.It is Platform independent.")));

    }
    public static void calculateAverage(Intern[] array){
        int total= array.length;
        int sum=0;
        for (int i=0;i<total;i++){
            sum+=array[i].getSalary();
        }
        System.out.println("Average is :"+sum/total);
    }

    public static int[] result(String input){
        int[]arr=new int[3];
        String[]statement=input.split("\\.");
        int scount= statement.length;
        String[]words= input.split("\\W+");
        int wcount= words.length;
       int  lcount=0;
        for(int i=0;i<input.length();i++){
            char ch=input.charAt(i);
            if(Character.isLetter(ch)){
                lcount++;
            }
        }
        arr[0]=scount;
        arr[1]=wcount;
        arr[2]=lcount;
        return arr;

    }



}
