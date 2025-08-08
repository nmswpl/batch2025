package in.co.nmsworks.week1.day2.Pattern;

public class ReversePyramidNumericPattern {

    public static void main(String[] args)
    {
        int num=7;
        for(int i=1;i<=num;i++)
        {
            for(int j=num-i;j>=0;j--)
            {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
