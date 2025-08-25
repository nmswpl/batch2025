package in.co.nmsworks.week1.test;

public class HundredPosition
{
    public static void main(String[] args)
    {
        int num = 4735;
        String[] str = {"Zero","one" , "Two" , "Three" , "Four", "Five", "Six" , "seven" , "Eight", "nine"};
        int digit = 0;
        for(int i=0;i<3;i++)
        {
            digit = num%10;
            num = num/10;
        }
        System.out.println(str[digit]);
    }


}
