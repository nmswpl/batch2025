package in.co.nmsworks.week1.day2;

public class Pattern1
{
    public static void main(String[] args)
    {
        int n = 7;
        patternOne(n);
    }
    public static void patternOne(int n)
    {
        for(int i=1;i<n+1;i++){
            for(int j=1;j<i+1;j++){
                System.out.print(j);
            }
            System.out.println("");
        }
    }
}
