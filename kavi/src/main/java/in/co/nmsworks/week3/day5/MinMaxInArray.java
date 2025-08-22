package in.co.nmsworks.week3.day5;

public class MinMaxInArray {
    public static void main(String[] args) {
        int[] numbers = {12, 5, 7, 89, 34, 2, 76};

        int min = numbers[0];
        int max = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        System.out.println("minimum element " + min);
        System.out.println("maximum element" + max);
    }
}

