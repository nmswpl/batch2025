package in.co.nmsworks.week1.day2.pattern;

//Numeric Pattern 2:
//        1 1 1 1 1 1 1
//        2 2 2 2 2 2
//        3 3 3 3 3
//        4 4 4 4
//        5 5 5
//        6 6
//        7
public class NumericPattern2 {
    public static void main(String[] args)
    {
        new NumericPattern2().pattern2(7);
    }
    public void pattern2(int n)
    {
        for(int i=1;i<=n;i++)
        {
            for(int j=n-i;j>=1;j--)
            {
                System.out.print(i+" ");
            }
            System.out.println();

        }

    }
}
