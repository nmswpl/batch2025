package in.co.nmsworks.week3.day5;

public class FindMaxMin {
    public static void printMinMax() {
        int[] input = {1, 2, 3, 4, 5, 1};
        int max = input[0];
        int min = input[0];

        for (int i = 0; i < input.length; i++) {
            if (i > max) {
                max = i;
            } else {
                min = i;
            }
        }
        System.out.println("Max No : " + max);
        System.out.println("Min No : " + min);
    }
    public static void main(String[] args) {
        printMinMax();
    }
}
