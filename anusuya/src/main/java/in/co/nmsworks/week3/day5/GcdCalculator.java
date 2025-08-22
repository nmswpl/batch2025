package in.co.nmsworks.week3.day5;

public class GcdCalculator {

    public static void main(String[] args) {

        GcdCalculator gcd = new GcdCalculator();

        gcd.printGcdOfTwoNumbers(20,5);
    }

    private void printGcdOfTwoNumbers(int a, int b) {

        int r = 0;
        System.out.print("GCD of " + a + " and " + b + " is : ");
        while (b > 0){
            r = a % b;
            a = b;
            b = r;
        }
        System.out.print(a);
    }
}
