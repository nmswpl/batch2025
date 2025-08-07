package in.co.nmsworks.week1.day2;

public class Factorial {
    // Find the Factorial for given Number
    public long getFactorial(long n){
        long fact = 1L;
        for (int i = 1 ; i <= n ; i++){
            fact = fact * i;
        }
        return fact;
    }
    public static void main(String[] args) {
        Factorial ft = new Factorial();
        System.out.println("Factorial is : "+ft.getFactorial(7L));
        System.out.println("Factorial is : "+ft.getFactorial(22L));
    }
}
