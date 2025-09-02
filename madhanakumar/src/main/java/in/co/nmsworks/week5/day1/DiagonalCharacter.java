package in.co.nmsworks.week5.day1;

import java.util.Scanner;

public class DiagonalCharacter {
    public static void main(String[] args) {
        DiagonalCharacter diagonalCharacter = new DiagonalCharacter();
        diagonalCharacter.printDiagonal();
    }

    private void printDiagonal() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = scan.nextInt();
        scan.close();
        for(int i = 0 ; i < num ; i++){
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            System.out.print((char)(97+i));
            System.out.println();
        }
    }
}
