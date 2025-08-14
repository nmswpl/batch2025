package in.co.nmsworks.week2.day4;

public class SecondLargest {
    private static int findSecondLargest(int[] arr) {
        int max = Integer.MIN_VALUE;
        int sMax = Integer.MIN_VALUE;
        for(int i : arr) {
            if(i >= max) {
                sMax = max;
                max = i;;
            }
            else if(i < max && i >= sMax) {
                sMax = i;
            }
        }
        return sMax;
    }

    public static void main(String[] args) {
        int[] arr = {5,8,2,90,12};
//        int[] arr = {6,6,6};
//        int[] arr = {6,6,5};
        System.out.println("Second Maximum: " + findSecondLargest(arr));
    }
}
