package in.co.nmsworks.week1.day2.pattern;

//Numeric Pattern 1 :
//        1
//        1 2
//        1 2 3
//        1 2 3 4
//        1 2 3 4 5
//        1 2 3 4 5 6
//        1 2 3 4 5 6 7
public class NumericPattern {
    public static void main(String[] args)
    {
        new NumericPattern().pattern(7);
    }
    public void pattern(int n)
    {
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}