package in.co.nmsworks.week3.day5.set1;

public class SumOfDigits {
    public static void main(String[] args) {
        SumOfDigits sumOfDigits = new SumOfDigits();
        int number = 333;
        System.out.println("Sum of "+number+" is : "+sumOfDigits.sumOfGivenNumber(number));
    }

    private int sumOfGivenNumber(int number) {
        int total= 0;
        while (number >0){
            total = total + (number % 10);

            number = number / 10;
        }

        return total;
    }
}
