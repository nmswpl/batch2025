package in.co.nmsworks.week2.day4;

public class EvenOrOdd {

    public static void printMax() {
//        Given an array of integers, Write a Program to count and print number of even elements in the array.

        int[] input = {1, 2, 3, 4, 5, 6};
        int max=input [0];
        int mix=input [0];


        for (int i = 0; i < input.length; i++) {
            if (i>max) {
                max=i;
            } else {
                mix=i;
            }
        }
        System.out.println("Max : " + max);
        System.out.println("Min : " + mix);

    }







    public static void main(String[] args) {

        printMax();

    }
}


