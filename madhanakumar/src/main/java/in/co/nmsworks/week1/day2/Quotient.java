package in.co.nmsworks.week1.day2;

public class Quotient {
    /* Quotient Remainder Program*/
    public int findQuotient(int a, int b) {
        return a / b;
    }
    public int findRemainder(int a, int b) {
       return a % b;
    }
    public static void main(String[] args) {
        Quotient q = new Quotient();
        System.out.println("The Quotient is :" + q.findQuotient(99, 7));
        System.out.println("The Remainder is :" + q.findRemainder(99, 7));
        System.out.println("---------------------------------------------");
        System.out.println("The Quotient is :" + q.findQuotient(25, 3));
        System.out.println("The Remainder is :" + q.findRemainder(25, 3));
    }
}
