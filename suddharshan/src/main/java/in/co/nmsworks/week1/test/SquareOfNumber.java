package in.co.nmsworks.week1.test;

public class SquareOfNumber {
    public static void main(String[] args) {
        int arr[] = new int[] {2,4,3,5};
        printSquareNumber(arr);
    }
    public static void printSquareNumber(int[] arr){
        for(int i = 0; i < arr.length; i++){
            int square = arr[i] * arr[i];
            System.out.print(square + " ");
        }
    }
}
