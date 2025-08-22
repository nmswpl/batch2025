package in.co.nmsworks.week3.day5;


public class SumOfDigits {
    public static void main(String[] args) {
        int number = 12345;
        int sum = 0;

        int temp = number;

        while (number != 0) {
            int digit = number % 10;
            sum += digit;
           number /=10;
        }

        System.out.println("Sum of digits" +temp+ " " +sum);
    }
}
