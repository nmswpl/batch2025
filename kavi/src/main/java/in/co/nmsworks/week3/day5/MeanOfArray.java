package in.co.nmsworks.week3.day5;

public class MeanOfArray {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        int sum = 0;

        for (int num : numbers) {
            sum=sum+ num;
        }
        double mean = (double) sum/numbers.length;

        System.out.println("mean of the array is: " + mean);
    }
}

