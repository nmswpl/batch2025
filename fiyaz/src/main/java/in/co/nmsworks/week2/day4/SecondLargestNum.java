package in.co.nmsworks.week2.day4;

public class SecondLargestNum {

    public static void main(String[] args) {

        int arr1[] = {0, 35, 2, 6, 4, 7, 4, 2};

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0 ; j < arr1.length - 1 ; j++) {
                if (arr1[i] < arr1[j + 1]) {
                    int temp = arr1[i];
                    arr1[i] = arr1[j + 1];
                    arr1[j + 1] = temp;
                }
            }
        }
        System.out.println(arr1[arr1.length-1]);
    }
}
