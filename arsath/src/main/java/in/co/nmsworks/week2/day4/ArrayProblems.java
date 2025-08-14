package in.co.nmsworks.week2.day4;

public class ArrayProblems {

    public static void printEven(int[] arr){
        for(int i = 0; i<=arr.length-1; i++){
            if(arr[i] % 2 == 0){
                System.out.print(arr[i] + " ");
            }
        }
    }

    public static void minAndMax(int[] arr1){
        int min = arr1[0];
        int max = arr1[0];
        for(int i = 0; i <= arr1.length-1; i++){
            if(arr1[i] <= min){
                min = arr1[i];
                i++;
            }
        }
        System.out.println("Min: " + min);

        for(int i = 0; i <= arr1.length-1; i++){
            if(arr1[i] >= max){
                max = arr1[i];
                i++;
            }
        }
        System.out.println("Max: " + max);
    }

    public static void secondLargestNumber(int[] arr1){
        int max = -1;
        int secondMax = -1;

        for(int i = 0; i <= arr1.length-1; i++){
            if(arr1[i] >= max){
                max = arr1[i];
            }
        }

        for(int i=0;i<=arr1.length-1;i++){
            if(arr1[i] > secondMax  && arr1[i]!= max ){
                secondMax = arr1[i];
            }
        }
        System.out.println("Second Max: " + secondMax);
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};

        printEven(arr);
        System.out.println();
        System.out.println();

        int[] arr1 = {3,7,1,2,7,6,4,9,5,10,8};
        minAndMax(arr1);

        System.out.println();

        secondLargestNumber(arr1);

    }
}
