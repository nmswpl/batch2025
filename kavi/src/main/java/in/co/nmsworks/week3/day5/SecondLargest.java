package in.co.nmsworks.week3.day5;

public class SecondLargest{
    public static void main(String[] args) {
        int[] numbers = {10, 20, 5, 8, 60, 25};

        int largest = numbers[0];
        int secondLargest = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > largest) {
                largest = numbers[i];
            }
        }
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > secondLargest && numbers[i] < largest) {
                secondLargest = numbers[i];
            }
        }
        System.out.println("secong Largest number is" + secondLargest);
    }
}
