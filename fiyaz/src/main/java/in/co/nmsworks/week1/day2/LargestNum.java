package in.co.nmsworks.week1.day2;

//5) Factorial Write a program to Find Largest Among Three numbers using
//if..else statement

public class LargestNum {
    public static void main(String[] args) {

        int arr[]= {69,3,2};
        largestNum(arr);
    }

    public static void largestNum(int arr1[]) {

        if(arr1[0] > arr1[1] && arr1[0] > arr1[2]) {
            System.out.println(arr1[0]);
        }
        else if (arr1[1] > arr1[0] && arr1[1] > arr1[2]) {
            System.out.println(arr1[1]);
        }
        else  {
            System.out.println(arr1[2]);
        }
    }

}