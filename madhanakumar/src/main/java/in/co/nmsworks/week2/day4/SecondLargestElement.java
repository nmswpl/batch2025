package in.co.nmsworks.week2.day4;

public class SecondLargestElement {
    public static void main(String[] args) {
        int[] a = {25,33,23,12,9};
        secondLargestElement(a);
    }

    private static void secondLargestElement(int[] a) {
        int firstLargest = a[0];
        int secondLargest = 0;
        int temp;

        for (int i = 0 ; i < a.length ; i++){
            if (secondLargest < a[i] ){
                secondLargest = a[i];
                if (firstLargest < secondLargest){
                    temp = firstLargest;
                    firstLargest = secondLargest;
                    secondLargest = temp;
                }
            }
        }
        System.out.println("Second Largest Element in the array is : "+secondLargest);
    }

}
