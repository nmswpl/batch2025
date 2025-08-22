package in.co.nmsworks.week3.day5;

public class MeanofSumOfArray {

    public static void meanSumOfArray() {
        int[] arr = {1, 2, 3, 4,8};
        int sum = 0;
        int mean = 5;

        for (int i = 0; i < arr.length; i++) {
            sum += i;
        }

        System.out.println("sum of numbers : " + sum);
        System.out.println("Sum of numbers Mean : " + sum/mean);
    }

    public static void main(String[] args) {
        meanSumOfArray();


    }
}


