package in.co.nmsworks.week3.day5;

import java.util.ArrayList;
import java.util.List;

public class SumOfDiagonals {

    public static void printSumOfDiagonals() {
        List<Integer[]> diagonals = new ArrayList<>();
        diagonals.add(new Integer[]{1, 2, 3});
        diagonals.add(new Integer[]{4, 5, 6});
        diagonals.add(new Integer[]{1, 2, 3});

        Integer[] index1 = diagonals.get(0);
        double inde1 = 0;
        double inde2=0;
        int inde3=0;
        int inde4=0;
        int inde5=0;
        for (int i = 0; i < index1.length; i++) {
//            inde1 = index1[0] * index1[0] * index1[0];
            inde1 = Math.pow(index1[0],3);
            System.out.println(inde1);

        }
        Integer[] index2 = diagonals.get(1);
        for (int i = 0; i < index2.length; i++) {
//            inde2 = index2[1] * index2[1] * index2[1];
            inde2 = Math.pow(index2[1],3);
        }
        Integer[] index3 = diagonals.get(1);
        for (int i = 0; i < index3.length; i++) {
            inde3 = index3[2] * index3[2] * index3[1];
        }
        Integer[] index4 = diagonals.get(0);
        for (int i = 0; i < index4.length; i++) {
            inde4 = index4[2] * index4[2] * index4[2];

        }
        Integer[] index5 = diagonals.get(2);
        for (int i = 0; i < index4.length; i++) {
            inde5 = index5[2] * index5[2] * index5[2];

        }


//        System.out.println("Sum of Cube of diagonals : "+ ((inde1)+(inde2)+(inde3)+(inde4)+(inde5)));

//        for (int eachone:index){
//            char ch=Character.valueOf('1');
//            int i = (ch) ^ 1;
//            System.out.println(i);
//        }

    }

    public static void main(String[] args) {
//        SumOfDiagonals sumOfDiagonals=new SumOfDiagonals();
        printSumOfDiagonals();
    }

}
