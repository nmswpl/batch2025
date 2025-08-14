package in.co.nmsworks.week2.day4;

public class CountAndPrintEven {

    public static void countPrintEven(int[] arr) {
        int count = 0;
        for(int i = 0 ; i < arr.length ; i++) {
            if(arr[i] % 2 == 0) {
                count++;
                System.out.print(arr[i] + "\t");
            }
        }
        System.out.println();
        System.out.println("Count: " + count);
    }
    public static void main(String[] args) {
        int[] arr = new int[] {1,2,3,4,5,6,7,8,9,10};
        countPrintEven(arr);
    }
}
