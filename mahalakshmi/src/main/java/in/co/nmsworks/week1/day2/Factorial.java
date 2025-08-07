package in.co.nmsworks.week1.day2;

public class Factorial {

    // 4) Factorial Program in Java
    public static void main(String[] args) {
        int n = 5;
        System.out.println("Factorial 0f " + n + " is " + fact(n));
    }

    public static int fact(int n) {
        if(n == 1)
            return 1;
        else {
            return n * fact(n-1);
        }
    }
}
