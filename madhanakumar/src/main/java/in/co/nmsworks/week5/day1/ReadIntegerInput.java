package in.co.nmsworks.week5.day1;

import java.util.Scanner;

public class ReadIntegerInput {
    public static void main(String[] args) {
        ReadIntegerInput integerInput = new ReadIntegerInput();
        integerInput.readAndSum();
    }

    private void readAndSum() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the integer : ");
        int input;
        int sum = 0;
        while((input = scan.nextInt())!= 0){
            sum += input;
        }
        System.out.println("Total sum value is : "+sum);
        scan.close();
    }
}