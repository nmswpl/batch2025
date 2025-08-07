package in.co.nmsworks.week1.day2.First;
//Factorial Program in Java

public class Fact {
    static int n = 5;
    static int fact = 1;

    static void call() {
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }

    }
    public static void main(String[] args) {
        call();
        System.out.println("Factorial of 5 :" + fact);



    }



}
