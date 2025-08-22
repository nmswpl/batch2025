package in.co.nmsworks.week3.day5;

public class MeanCalculator {

    public static void main(String[] args) {

        MeanCalculator mc = new MeanCalculator();

        mc.printMeanOfAnArray(new int[]{1,2,3,4,5});
    }

    private void printMeanOfAnArray(int[] numbers) {

        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }

        System.out.println("Mean of an Array is : " + (sum/numbers.length));
    }
}
