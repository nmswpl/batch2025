package in.co.nmsworks.week5;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Practice
{
    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        Practice p = new Practice();
        //p.sumOfInteger();
        //p.gcdOfNumber();
        //p.fibonacciSeries();
        p.alphaPattern();


    }

    public void sumOfInteger(){

        Scanner sc = new Scanner(System.in);
        int sum =0 ;
        System.out.println("Enter the number : ");
        int num = sc.nextInt();
        while(num!=0){
            sum += num ;
            System.out.println("Enter the number : ");
            num = sc.nextInt();
        }
        System.out.println("Sum of the Entered number is : " + sum);
    }

    public void gcdOfNumber(){

        System.out.println("Enter a : ");
        int a = sc.nextInt();
        System.out.println("Enter b : ");
        int b = sc.nextInt();

        if(a<b){
            int temp = a;
            a =b ;
            b = temp;
        }

        while(b!=0){
            int r = a % b;
            a = b;
            b = r ;
        }
        System.out.println("GCD : " + a);
    }

    public void fibonacciSeries(){
        System.out.println("Enter the number : ");
        int num = sc.nextInt();
        int first = 0;
        int second = 1;

        if(num<2){
            System.out.print(first);
            return;
        }
        else{
            System.out.print( first + " " + second);
        }

        for(int i= 2;i<num;i++){
            int fibbo = first + second;
            System.out.print(" " + fibbo);
            first = second;
            second = fibbo;

        }
    }

    public void alphaPattern(){
        System.out.println("Enter the number : ");
        int num = sc.nextInt();
        for(int i=0;i<num;i++){
            char ch = (char) (97 + i);
            for(int j =0;j<i;j++){
                System.out.print(" ");
            }
            System.out.print(ch);
            System.out.println();
        }
    }

}
