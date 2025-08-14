package in.co.nmsworks.week2.day4;

public class ArrayProblems {
    public static void main(String[] args) {
        int [] arr = {1,2,4,6,3,8,10};
        printEvenNumber(arr);
    }

    public  static void printEvenNumber(int[] arr) {
        int count = 0;
        for(int i : arr){
            if (i % 2 == 0){
                count ++;
                System.out.println(i);
            }
        }
        System.out.println("The number of even numbers :" + count);
    }

}
