package in.co.nmsworks.week5.day1;

import java.util.Scanner;

public class Runner
{
    public static void main(String[] args) {

        Runner r = new Runner();
//            r.addSumUntilZero();
//            r.gcdFinder();
//            r.fibonacciSeries();
//            r.printAlphaBets();

    }

    private void printAlphaBets()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        for(int i=1;i<=num;i++)
        {
            for(int j=1;j<i;j++)
            {
                System.out.print(" ");
            }
            System.out.println((char)(96+i));
        }
    }

    private void fibonacciSeries()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the limit");
        int limit = sc.nextInt();
        int a = 0, b = 1;
            for (int i=0;i<limit;i++)
            {
                System.out.print(a + " ");
                int next = a + b;
                a = b;
                b = next;
            }
    }

    private void gcdFinder()
    {
        int a = 315;
        int b = 525;
        int r,temp=0;
        if(a<b) {
            temp=a;
            a=b;
            b=temp;
            System.out.println("a is "+a);
            System.out.println("b is "+b);
        }
            while(true)
            {
                r=a%b;
                a=b;
                b=r;
                if(b==0)
                {
                    break;
                }
            }
            System.out.println(a);
        }



    private void addSumUntilZero()
    {
        Scanner sc = new Scanner(System.in);
        int sum=0;
        while (true)
        {
            System.out.println("Enter the Number");
            int num = sc.nextInt();
            if(num!=0)
            {
                sum=sum+num;
            }
            else
                break;
        }
        System.out.println("The Sum of Digits before entering Zero");
        System.out.println(sum);
        sc.close();
    }


}
