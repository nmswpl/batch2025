package in.co.nmsworks.week1.day2.Pattern;

public class Numericpyramidpattern2 {

    public static void main(String[] args)
    {
        int num=7;
        for(int i=1;i<=num;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print((char)(i+64)+" ");
            }
            System.out.println();
        }
    }
}
