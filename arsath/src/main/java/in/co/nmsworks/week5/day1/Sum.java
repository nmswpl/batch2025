package in.co.nmsworks.week5.day1;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=-1;
        int sum = 0;

        while(n!=0){
            System.out.println("Enter the number: " );
            n = sc.nextInt();
            sum += n;
        }
        System.out.println(sum);
    }
}
