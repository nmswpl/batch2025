package in.co.nmsworks.week2.day4;

public class MinAndMax {
    public static void main(String[] args) {
        int[] a = {25,33,23,12,9};
        MinAndMax(a);
    }
    private static void MinAndMax(int a[]){
        int min = a[0];
        int max = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] < min) {
                min = a[i];
            }
            if (a[i] > max) {
                max = a[i];
            }
        }
        System.out.println("Minimum Element Present in the array is : " + min);
        System.out.println("Maximum Element Present in the array is : " + max);
    }
}
