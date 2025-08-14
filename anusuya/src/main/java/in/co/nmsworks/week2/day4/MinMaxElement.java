package in.co.nmsworks.week2.day4;

public class MinMaxElement {

    public static void main(String[] args) {

        printMinimumMaximumElement(new int[]{10,20,3,50});
    }

    public static void printMinimumMaximumElement(int[] arr){

        int maxElement = arr[0];
        int minElement = arr[0];

        for(int i = 1; i < arr.length; i++){
            if(arr[i] > maxElement){
                maxElement = arr[i];
            }
            if(arr[i] < minElement){
                minElement = arr[i];
            }
        }

        System.out.println("Maximum element is : " + maxElement);
        System.out.println("Minimum element is : " + minElement);
    }
}
