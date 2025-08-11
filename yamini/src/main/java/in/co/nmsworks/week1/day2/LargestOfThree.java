//Write a program to Find Largest Among Three numbers using
package in.co.nmsworks.week1.day2;

public class LargestOfThree {
    public static void main(String[] args) {
        int a = 10;
        int b = 13;
        int c = 18;
        largestOfThree(a, b, c);
    }

    public static void largestOfThree(int a, int b, int c) {
        if (a >= b && a >= c) {
            System.out.println("a is greater");
        } else if (b >= c ){
            System.out.println("b is greater");

        } else {
            System.out.println("c is greater");
        }
    }
}
