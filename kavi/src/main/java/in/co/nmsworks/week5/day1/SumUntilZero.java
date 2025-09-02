package in.co.nmsworks.week5.day1;

import java.util.Scanner;

public class SumUntilZero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int number;


        System.out.println("enter numbers (enter 0 to stop):");

        do {
            number = scanner.nextInt();
            sum += number;
        } while (number != 0);

        System.out.println("The sum is: " + sum);
    }
}
