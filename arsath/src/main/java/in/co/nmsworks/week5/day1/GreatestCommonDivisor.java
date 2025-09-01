package in.co.nmsworks.week5.day1;

public class GreatestCommonDivisor {
    public static void main(String[] args) {
        GreatestCommonDivisor gcd = new GreatestCommonDivisor();
        gcd.greatestCommonDivisor(315,525);
    }
    public void greatestCommonDivisor(int a, int b){
        System.out.println("The Greatest Common Divisor of " + a + " and " + b + " is: ");
        if(a>b){
            int temp = a;
            a = b;
            b = temp;
        }
        while(b!=0){
            int r = a % b;

            int temp = a;
            a = b;
            b = temp;

            int temp1 = r;
            r = b;
            b = temp1;
        }
        System.out.println(a);
    }
}
