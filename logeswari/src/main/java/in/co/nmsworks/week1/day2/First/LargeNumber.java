package in.co.nmsworks.week1.day2.First;

//Java Basic Programs
//
//5) Write a program to Find Largest Among Three numbers using
//if..else statemet

public class LargeNumber {
    static int num1=20;
    static int num2=10;
    static int num3=5;
    static void getLargestNum(){
        if((num1>num2)&&(num1>num2)){
            System.out.println("largest no is : "+num1);
        } else if ((num2>num3)) {
            System.out.println("largest no is : "+num2);
        }
        else{
            System.out.println("largest no is : "+num3);
        }
    }
    public static void main(String[] args) {
        getLargestNum();
    }
}
