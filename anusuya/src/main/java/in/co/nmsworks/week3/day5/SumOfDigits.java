package in.co.nmsworks.week3.day5;

public class SumOfDigits {

    public static void main(String[] args) {

        SumOfDigits sod = new SumOfDigits();

        int number = 907;
        sod.calculateAndPrintSumOfDigits(number);
    }

    private void calculateAndPrintSumOfDigits(int number) {

        int sum = 0;
        int num = number;
        while (number > 0){
            sum += number % 10;
            number /= 10;
        }
        System.out.println("Sum of Digits of " + num + " is : " + sum);
    }
}
