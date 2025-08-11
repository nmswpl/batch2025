package in.co.nmsworks.week1.test;

import java.awt.*;

public class NumbersDivisibleByThree {
    public static void main(String[] args) {
        printNumbersDivisibleByThree();
    }

    public static void printNumbersDivisibleByThree() {
        for (int i = 300; i < 400; i++) {
            if (i % 3 == 0) {
                System.out.print(i + " ");
            }
        }


    }
}
