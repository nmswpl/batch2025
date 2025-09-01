package in.co.nmsworks.week5.day1;

public class GCD {
    public static void main(String[] args) {
        GCD gcd = new GCD();
        System.out.println(gcd.getGCD(24,12));
        System.out.println(gcd.getGCD(25,15));
        System.out.println(gcd.getGCD(315,525));
    }

    public int getGCD(int a, int b){
        int c, d;
         if(b > a){
             c = b;
            d = a;
        }
         else{
             c = a;
             d = b;
         }
         while(d != 0){
             int rem = c % d;
             c = d;
             d = rem;
         }
         return c;
    }
}
