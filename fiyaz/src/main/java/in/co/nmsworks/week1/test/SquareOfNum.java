package in.co.nmsworks.week1.test;

public class SquareOfNum {
    public static void main(String[] args) {

        int arr[] = {2, 4, 3, 5};


        findThesqare(arr);
    }

    public static void findThesqare(int arr1[]) {

        for (int num : arr1) {
            System.out.println(num * num);
        }
    }
}
