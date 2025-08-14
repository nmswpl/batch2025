package in.co.nmsworks.week2.day4;

public class SecondLargest {

    public static void printSecondMax() {
        int[] input = {1,2, 2, 3, 4, 5, 6};
        int max = input[0];
        int min = input[0];
        int temp=0;

        for (int i = 0; i < input.length; i++) {
            if (i > max) {
                temp=max;
                max = i;
                i=temp;

            } else {
                min = i;
            }
        }
        System.out.println("Second Max : " +temp);
    }


    public static void main(String[] args) {
        printSecondMax();
    }
}
