package in.co.nmsworks.week5.day1;

import java.util.Collections;
import java.util.Scanner;

public class DiagonalAlphabet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }

           System.out.println((char) ('a' + i));

        }
        scanner.close();

    }
}

