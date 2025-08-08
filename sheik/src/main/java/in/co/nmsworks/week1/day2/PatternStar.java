package in.co.nmsworks.week1.day2;

public class PatternStar
{
    public static void main(String[] args)
    {
        int n = 7;
        patternStar(n);
    }
    public static void patternStar(int n)
    {
        for(int i=1;i<n+1;i++){
            for(int j=1;j<i+1;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
