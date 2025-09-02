package in.co.nmsworks.week5.day1;

public class FindGCD {
    public static void main(String[] args) {
        FindGCD findGCD = new FindGCD();
        findGCD.identifyGCD(315,525);
    }

    private void identifyGCD(int a, int b) {
        int r = 0;
        int temp;
        if(a < b){
            temp = a;
            a = b ;
            b = temp;
        }
        while(b > 0) {
            r = a % b;
            a = b;
            b = r;
        }
        System.out.println("GCD is : " + a);
    }
}
