package in.co.nmsworks.week3.day5;

public class MedianOfEven {

    public static void printMedianOfEven() {
        int[] arr = {1, 2, 3, 4, 0};
        int evensum = 0;
        int oddSum = 0;

        for (int i = 0; i < arr.length; i++) {
            if ((i % 2) == 0) {
                evensum += i;
            }else {
                oddSum+=i;
            }
        }
        System.out.println("sum of numbers : " + evensum);
        System.out.println("Sum of numbers Mean : " + oddSum);

    }
    public static void main(String[] args) {
        printMedianOfEven();

    }
}
