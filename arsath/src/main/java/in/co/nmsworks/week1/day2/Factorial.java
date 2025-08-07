package in.co.nmsworks.week1.day2;

public class Factorial {
    //Factorial Program in Java
    public static void printFactorial(int b){
        int a = 1;
        for(int i = 1; i <= b; i++){
            a *= i;
        }
        System.out.println(a);
    }

    public static void main(String[] args) {
        int b = 5;
        printFactorial(b);
    }
}
