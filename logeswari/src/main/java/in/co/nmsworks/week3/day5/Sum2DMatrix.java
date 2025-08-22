package in.co.nmsworks.week3.day5;

import java.util.ArrayList;
import java.util.List;

public class Sum2DMatrix {

    public static void printSum2dMatrix() {
        List<Integer[]> sum = new ArrayList<>();
        sum.add(new Integer[]{1, 2, 3});
        sum.add(new Integer[]{4, 5, 6});
        sum.add(new Integer[]{7, 8, 9});

        for (int i = 0; i < sum.size(); i++) {
            for (int j = 0; j < i; j++) {
                int b=i+j;

                System.out.println(b);
            }
//            Integer[] a = sum.getFirst();
//            Integer[] b = sum.getFirst();
//            Integer[] c = sum.getFirst();
//            System.out.println(b);
        }
    }

    public static void main(String[] args) {
        printSum2dMatrix();

    }
}
