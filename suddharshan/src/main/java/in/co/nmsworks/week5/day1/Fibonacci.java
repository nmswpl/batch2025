package in.co.nmsworks.week5.day1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Fibonacci fib = new Fibonacci();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        System.out.println("Series is: " + fib.getFibonacci(num));
    }
    public List<Integer> getFibonacci(int num){
        List <Integer> fibList = new ArrayList<>();
        int a = 0, b = 1;
        if(num == 1){
            fibList.add(a);
            return fibList;
        }
        if(num==2){
            fibList.add(a);
            fibList.add(b);
            return fibList;
        }
        else{
            fibList.add(a);
            fibList.add(b);
            while(num-2 != 0){
                int sum = a + b;
                fibList.add(sum);
                a = b;
                b = sum;
                num--;
            }
            return fibList;
        }
    }
}
