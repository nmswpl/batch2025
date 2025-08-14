package in.co.nmsworks.week2.day4;

public class EvenElements {

    public static void main(String[] args) {

        countAndPrintNoOfEvenElements(new int[]{2,3,5,6,7,8});

    }

    public static void countAndPrintNoOfEvenElements(int[] arr){

        int count = 0;

        for(int i = 0; i < arr.length; i++){
            if (arr[i] % 2 == 0){
                count++;
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();
        System.out.println("Total no of Even elements is : " + count);
    }
}
