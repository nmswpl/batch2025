package in.co.nmsworks.week3.day5;

import java.util.Arrays;

public class FindMedian {
    public static void main(String[] args) {
        FindMedian findMedian = new FindMedian();
        findMedian.getMedian();
    }

    private void getMedian() {
        int[] array = new int[]{6,21,30,61,4,19};
        Arrays.sort(array);
        double median;
        if (array.length % 2 != 0){
            median = array[array.length / 2];
        } else{
            int mid1 = array[(array.length / 2) - 1];
            int mid2 = array[array.length / 2];
            median = (mid1 + mid2) / 2.0;
        }
        System.out.println("Median : "+median);
    }
}
