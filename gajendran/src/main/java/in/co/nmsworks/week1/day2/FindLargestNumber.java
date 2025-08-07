package in.co.nmsworks.week1.day2;


// 5) Factorial Write a program to Find Largest Among Three numbers using if..else statement



public class FindLargestNumber {

    public static void findLargestNumber(int num1, int num2, int num3){
        if (num1 >= num2 && num1 >= num3){
            System.out.println(num1);
        }
        else if (num2 >= num1 && num2 >= num3){
            System.out.println(num2);
        }
        else {
            System.out.println(num3);
        }
    }

    public static void main(String[] args) {
        int num1 = 5, num2 = 6, num3 =1;
        findLargestNumber(num1,num2,num3);
    }

}
