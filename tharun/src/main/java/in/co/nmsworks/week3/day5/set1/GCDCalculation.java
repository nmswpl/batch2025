package in.co.nmsworks.week3.day5.set1;

public class GCDCalculation {
    public static void main(String[] args) {
        GCDCalculation gcd = new GCDCalculation();
        int divided = 80 , divisor = 15 ;
        System.out.println("GCD of "+ divided +" and "+divisor+" is "+gcd.printGCD(divided,divisor));
    }

    private int printGCD(int divided, int divisor) {
        int reminder;
        if (divided > divisor){
            while (divisor > 0){
                reminder = divided % divisor;
                divided = divisor;
                divisor = reminder;
            }
        }
        return divided;
    }
}
