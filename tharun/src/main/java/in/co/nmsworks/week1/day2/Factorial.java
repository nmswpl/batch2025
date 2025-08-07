package in.co.nmsworks.week1.day2;

/**
 * Factorial program in Java
 */
public class Factorial {
    static int factorial(int value){
        while(value <1){
            return 1;
        }
        return value * factorial(value-1);
    }

    public static void main(String[] args) {
        System.out.println(factorial(5));
    }
}
