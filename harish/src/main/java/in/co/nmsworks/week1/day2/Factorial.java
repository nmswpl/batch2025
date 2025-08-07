//Factorial Program in Java


package in.co.nmsworks.week1.day2;

public class Factorial {
    public static void main(String[] args) {
        int number = 5;
        gEtFactorial(number);
    }

    public static void gEtFactorial(int factorialNum){
        int result = 1;
        for(int i = 1; i <= factorialNum; i++){
            result = result*i;
        }
        System.out.println("The factorial of a number : "+result);
    }
}
