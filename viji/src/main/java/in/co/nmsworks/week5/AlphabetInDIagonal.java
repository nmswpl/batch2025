package in.co.nmsworks.week5;

import java.util.Scanner;

public class AlphabetInDIagonal {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number :");
        int n = sc.nextInt();
        int ascii = 97 ;
        for(int i = 1 ; i<=n ; i++){

            for(int j = 1 ; j<= i ; j++) {
                if (j < i) {
                    System.out.print(" ");
                }
                else{
                    System.out.print((char) ascii);
                }
            }
            ascii++;
            System.out.println();
        }

    }
}
