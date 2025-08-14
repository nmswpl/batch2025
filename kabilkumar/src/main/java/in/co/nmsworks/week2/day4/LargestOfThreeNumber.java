package in.co.nmsworks.week2.day4;

public class LargestOfThreeNumber
{
    public static void main(String[] args) {


        int num1 = 3;
        int num2 = 48;
        int num3 = 8;
        findLargest(num1, num2, num3);
    }
    public static void findLargest(int a,int b,int c)
    {
        if (a>b && a>c)
        {
            System.out.println("the greatest number is : "+a);
        } else if (b>c && b>a)
        {
            System.out.println("the largest number is  :" +b);
        }
        else
        {
            System.out.println("the largest number is : "+c);
        }
    }

}

