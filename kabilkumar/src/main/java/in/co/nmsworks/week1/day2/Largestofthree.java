package in.co.nmsworks.week1.day2;

public class Largestofthree {
    public static void main(String[] args)
    {
        int a=10,b=15,c=2;
        if((a>b) && (a>c))
        {
            System.out.println(a);
        }
        else if ((b>c) && (b>a))
        {
            System.out.println(b);
        }
        else
        {
            System.out.println(c);
        }
    }
}
