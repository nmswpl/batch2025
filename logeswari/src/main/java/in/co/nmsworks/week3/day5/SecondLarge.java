package in.co.nmsworks.week3.day5;

public class SecondLarge {
    public static void printSecondArrayMax() {
        int[] input = {1,2, 2, 3, 4, 5, 6};
        int maxNum= input[0];
        int minNum = input[0];
        int temp=0;
        for (int i = 0; i < input.length; i++) {
            if (i > maxNum) {
                temp=maxNum;
                maxNum = i;
                i=temp;
            } else {
                minNum = i;

            }
        }
        System.out.println("Second Max : " +temp);
    }

    public static void main(String[] args) {
        printSecondArrayMax();
    }
}
