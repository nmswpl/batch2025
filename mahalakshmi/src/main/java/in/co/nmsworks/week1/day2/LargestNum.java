package in.co.nmsworks.week1.day2;

public class LargestNum {

    // 5)  Factorial Write a program to Find Largest Among Three numbers using if..else statement
    public static void main(String[] args) {
        int num1 = 10, num2 = 67, num3 = 50;
        System.out.println("Largest of three numbers: " + findLargest(num1,num2,num3));
        System.out.println("Largest of three numbers: " + findLargest(100, 59, 300));
    }

    public static int findLargest(int a, int b, int c) {
        if((a > b) && (a > c)) {
            return a;
        }
        else if ((b > a) && (b > c)) {
            return b;
        }
        else {
            return c;
        }
    }
}
