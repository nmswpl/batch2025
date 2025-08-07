package in.co.nmsworks.week1.day2;


// 4) Factorial Program in Java

public class Factorial {

    public static int factorial(int number){
        if (number == 1 || number == 0) return 1;
        return number * factorial(number-1);
    }

    public static void main(String[] args) {

        int num = 5;
        System.out.println("Factorial of 5");
        int fac = Factorial.factorial(num);
        System.out.println("Factorial of 5 is "+fac);


    }

}
