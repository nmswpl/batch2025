package in.co.nmsworks.week3.day5;

public class SumOfNumbers {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum+=i;

        }
        System.out.println("sum of numbers : "+sum);
    }
}
