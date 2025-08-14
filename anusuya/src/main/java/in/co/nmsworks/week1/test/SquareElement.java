package in.co.nmsworks.week1.test;

public class SquareElement {

    public static void printSquareElement(int[] arr){

        System.out.print(" Input : ");

        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }

        System.out.println();

        System.out.print(" Output : ");
        for(int i = 0; i < arr.length; i++){
            System.out.print((arr[i]*arr[i]) + " ");
        }
    }

    public static void main(String[] args) {

        int[] arr = {2,4,3,5};
        printSquareElement(arr);
    }
}
