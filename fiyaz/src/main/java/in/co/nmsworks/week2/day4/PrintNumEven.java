package in.co.nmsworks.week2.day4;

public class PrintNumEven {
    public static void main(String[] args) {

        int arr[] = {2,6,3,9,4,2,10};
        int count = 0;

        for (int i = 0; i <= arr.length - 1; i++) {
            if (arr[i] % 2 == 0) {
                System.out.print(arr[i] + " ");
                count = count + 1;
            }
        }
        System.out.println();
        System.out.println("Count : " + count);
    }
}
