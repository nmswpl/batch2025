package in.co.nmsworks.week3.day5;

public class GCD {
    public static void main(String[] args) {
        int a = 48;
        int b = 18;

        int result = printGCD(a, b);
        System.out.println("GCD of " + a +" "+ b + " is: " + result);
    }
    public static int printGCD(int a, int b) {
        while (b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }
        return a;
    }
}
