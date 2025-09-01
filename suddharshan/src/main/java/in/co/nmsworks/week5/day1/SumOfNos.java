package in.co.nmsworks.week5.day1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SumOfNos {
    public static void main(String[] args) {
        SumOfNos sn = new SumOfNos();
        List<Integer> numList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.print("Enter a number: ");
            int num = sc.nextInt();
            if(num == 0){
                System.out.println("Zero is entered...");
                break;
            }
            numList.add(num);
        }
        System.out.println("Sum is: " + sn.getSum(numList));
    }
    public int getSum(List <Integer> list){
        int sum = 0;
        for (Integer i : list) {
            sum+=i;
        }
        return sum;
    }
}
