package in.co.nmsworks.week1.day2;

// Factorial program in java

public class Factorial {

    private static int findFactorial(int num){

        int i = 1;
        int fact = 1;
        while (i <= num){
            fact = fact * i;
            i++;
        }

        return fact;
    }

    public static void main(String[] args) {

        int num = 5;
        System.out.println(" Factorial of " + num + " is : " + findFactorial(num));
    }
}
