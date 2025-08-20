package in.co.nmsworks.week3.set2.set1.battery;

import java.util.Arrays;
import java.util.LinkedList;

public class ReverseLinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> sortedArray = new LinkedList<>(Arrays.asList(1,2,3,4,5));
        Integer indexFromLeft = 0 , indexFrommRight = sortedArray.size()-1;
        while (indexFromLeft < indexFrommRight){
            int temp = sortedArray.get(indexFromLeft);
            sortedArray.set(indexFromLeft,sortedArray.get(indexFrommRight));
            sortedArray.set(indexFrommRight,temp);

            indexFromLeft++;
            indexFrommRight--;
        }
        System.out.println(sortedArray);
    }
}
