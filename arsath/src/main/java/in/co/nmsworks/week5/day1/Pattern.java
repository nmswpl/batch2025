package in.co.nmsworks.week5.day1;

import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        char c = 'a';

        for(int i = 1; i<= n; i++){
            for(int j=1;j<=i;j++){
              if(i==j){
                  System.out.println(c++);
              }
              else{
                  System.out.print(" ");
              }
            }
            System.out.println();
        }

    }
}
