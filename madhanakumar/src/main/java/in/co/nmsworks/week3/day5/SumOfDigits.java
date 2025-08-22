package in.co.nmsworks.week3.day5;

public class SumOfDigits {
    public static void main(String[] args) {
        SumOfDigits sumOfDigits = new SumOfDigits();
        sumOfDigits.countSum(387);
    }

    private void countSum(int digits) {
        int sum = 0;
        while (digits > 0){
            int rem = digits % 10;
            digits = digits / 10;
            sum += rem;
        }
        System.out.println(sum);
    }
}
