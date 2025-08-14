package in.co.nmsworks.week2.day4;

public class SecondLargestElement {


    public static void main(String[] args) {

        printSecondLargestElement(new int[]{100,20,30,500});
    }

    public static void printSecondLargestElement(int[] arr){
        int maxElement = arr[0];
        int secondMaxElement = 0 ;

        for(int i = 1; i < arr.length; i++){
            if(arr[i] > maxElement) {
                secondMaxElement = maxElement;
                maxElement = arr[i];
            }
            if(arr[i] > secondMaxElement && arr[i] != maxElement){
                secondMaxElement = arr[i];
            }
        }
        System.out.println("Second Max Element is  : " + secondMaxElement);
    }
}
