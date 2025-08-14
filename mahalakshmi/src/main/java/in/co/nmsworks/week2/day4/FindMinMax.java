package in.co.nmsworks.week2.day4;

public class FindMinMax {

    public static void findMinMax(int[] arr) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i : arr) {
            if(max < i) {
                max = i;
            }
            if(min > i) {
                min = i;
            }
        }
        System.out.println("Maximum: " + max);
        System.out.println("Minimum: " + min);

    }

    public static void main(String[] args) {
        int[] arr = {5,8,2,90,12};
        findMinMax(arr);

    }
}
