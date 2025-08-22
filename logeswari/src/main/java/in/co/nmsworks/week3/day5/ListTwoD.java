package in.co.nmsworks.week3.day5;

import java.util.ArrayList;
import java.util.List;

public class ListTwoD {

    public static void printListOf2D(){
        List<Integer[]> list = new ArrayList<>();
        list.add(new Integer[]{1, 2, 3});
        list.add(new Integer[]{4, 5, 6});
        list.add(new Integer[]{7, 8, 9});

        System.out.println("Return value : "+list.contains(5));
        Integer [] len= list.get(1);
        for (Integer i : len) {
            int store=i;
            System.out.println(store);

        }

    }

    public static void main(String[] args) {
        printListOf2D();

    }
}
