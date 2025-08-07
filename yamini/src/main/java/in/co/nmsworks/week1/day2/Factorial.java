// Factorial Program in Java
package in.co.nmsworks.week1.day2;

public class Factorial {
    public static void main(String[] args) {

        factorial(5);
    }
    public static void factorial(int num) {
        int fact = 1;

        for (int i = 1; i <= num; i++) {
            fact = fact * i;
        }
        System.out.println(fact);
    }
}
