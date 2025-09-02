package in.co.nmsworks.week5.day1;

import java.util.Scanner;

public class Fibannoci {
    public static void main(String[] args) {
        Fibannoci fibannoci = new Fibannoci();
        fibannoci.printSequence();
    }

    private void printSequence() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the limit value : ");
        scan.close();
        int n = scan.nextInt();
        int first = 0;
        int second = 1;
        for (int i = 0; i < n; i++) {
            System.out.println(first + " ");
            int finale = first + second;
            first = second;
            second = finale;
        }
    }
}
