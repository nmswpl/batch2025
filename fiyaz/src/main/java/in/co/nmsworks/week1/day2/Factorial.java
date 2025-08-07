package in.co.nmsworks.week1.day2;

//4) Factorial Program in Java

public class Factorial {
    public static void main(String[] args) {

        int num = 5;
        factorial(num);
    }

    public static void factorial(int n) {

        int factorial = 1;
        while(n>0) {
            factorial= factorial * n;
            n--;
        }
        System.out.println(factorial);
    }

}