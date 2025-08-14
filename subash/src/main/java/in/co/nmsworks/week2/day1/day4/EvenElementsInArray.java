package in.co.nmsworks.week2.day1.day4;

public class EvenElementsInArray {

    public static void main(String[] args) {
        int arr[] = new int[]{4, 7, 9, 30, 55, 33, 22, 66, 77, 78};
        printEvenNumbers(arr);

    }

    public static void printEvenNumbers(int arr[]) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                count++;
                System.out.print(arr[i]+" ");
            } else
                continue;
        }
        System.out.println();
        System.out.println("Count of even elements in an array " + count);
    }
}

