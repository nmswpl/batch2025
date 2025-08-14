package in.co.nmsworks.week2.day4;

public class CountAndPrintEvenElements {
    public static void main(String[] args) {
        printResult();
    }

    public static void printResult() {
        int[]arr={23,12,56,78,11,45,34};
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                count++;
                System.out.print(arr[i] + " ");
            }

        }
        System.out.println();
        System.out.println("Count: "+count);
    }
}
