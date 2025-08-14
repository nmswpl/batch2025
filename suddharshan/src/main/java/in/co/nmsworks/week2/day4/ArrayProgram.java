package in.co.nmsworks.week2.day4;

public class ArrayProgram {
    public static void main(String[] args) {
        int[] arr = new int[] {5,7,9,2,1,3,6,10};
        countAndPrintEvenNumber(arr);
        printMinAndMaxNumber(arr);
        printSecondLargest(arr);
    }
    public static void countAndPrintEvenNumber(int[] arr){
        int count = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] % 2 == 0){
                count++;
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();
        System.out.println("Count: " + count);
    }
    public static void printMinAndMaxNumber(int[] arr){
        int max = arr[0], min = arr[0];
        for(int i = 1; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
            else if(arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println("Maximum: " + max + "\nMinimum: " + min);
    }
    public static void printSecondLargest(int[] arr){
        int largest = arr[0], secondLargest = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            }
            else if (arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i];
            }
        }
        System.out.println("Second Largest: " + secondLargest);
    }
}
