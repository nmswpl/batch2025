package in.co.nmsworks.week2.day4;

public class Max {

    public static void printMinMax() {
        int[] input = {1, 2, 3, 4, 5, 6};
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


