package in.co.nmsworks.week3.day1.test.set2;

import java.util.Arrays;

public class TestRunner
{

    private String name;
    private double salary;
    public TestRunner() {
    }

    public TestRunner(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public static double averageSalary(TestRunner[] intern){
        double sum =0 ;
        for(int i=0;i<intern.length;i++){
            sum = sum + intern[i].getSalary();
        }
        return sum/intern.length;
    }

    public static void main(String[] args) {
        TestRunner interOne = new TestRunner("Fayas" , 2000.0d);
        TestRunner interTwo = new TestRunner("Arun" , 3000.0d);
        TestRunner interThree = new TestRunner("Ram" , 4000.0d);
        TestRunner interFour = new TestRunner("Som" , 3000.0d);
        TestRunner internFive = new TestRunner("Gokul" , 3500.0d);

        TestRunner intern[] = {interOne,interTwo,interThree,interFour,internFive};

        System.out.println(averageSalary(intern));


        String para = "Java is programming language.C language was developed first.But java is popular language.";
        //System.out.println(paraInfo(para));

        int[] info = paraInfo(para);
        System.out.println(Arrays.toString(info));


    }



    public static int[] paraInfo(String para){
        int[] arr = new int[3];
        String[] statement = para.split("\\.");
        arr[0] = statement.length;
        String[] words =para.split(" ");
        arr[1]= words.length;
        int count =0 ;
        for(int i=0;i<para.length();i++){
            if(para.charAt(i)>='a' || para.charAt(i)<='z'){
                count++;
            }
        }
        arr[2] = count;
        return arr;

    }



}
