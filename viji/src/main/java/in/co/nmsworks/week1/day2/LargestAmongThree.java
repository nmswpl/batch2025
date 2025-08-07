/*
Write a program to Find Largest Among Three numbers using
if else statement
*/
package in.co.nmsworks.week1.day2;

public class LargestAmongThree {

    public static void main(String[] args) {
        largestAmongThree(20, 55, 10);
    }

    public static void largestAmongThree(int a, int b, int c) {
        if (a > b) {
            if (a > c) {
                System.out.println("A is larger");
            }
        }
        else if (b > c && b>a) {
            System.out.println("B is larger");
        }
        else {
            System.out.println("C is larger");
        }

    }
}