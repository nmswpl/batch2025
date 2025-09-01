package in.co.nmsworks.week5.day1;

public class GCDOfTwoNumbers
{
    public static void main(String[] args)
    {
        int a = 525, b = 315;
        if (a < b)
        {
            int temp = a;
            a = b;
            b = temp;
        }
        while (b != 0)
        {
            int r = a % b;
            a = b;
            b = r;
        }
        System.out.println("The GCD is " + a);

    }
}
