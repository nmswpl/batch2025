package in.co.nmsworks.week2.day4;

import java.util.Arrays;

import static java.util.Arrays.*;
import static java.util.Arrays.sort;


public class SecondLargestElement {
    public static void main(String[] args) {

        int[] a = {1, 2, 8, 4, 5};

        int largest = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i] > largest) {
                largest = a[i];
            }
        }
        System.out.println(largest);

        int smallest = -1;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > smallest && a[i] != largest)
            {
                smallest = a[i];
            }
        }
        System.out.println(smallest);
    }
}
