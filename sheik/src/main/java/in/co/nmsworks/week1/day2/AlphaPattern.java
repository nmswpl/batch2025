package in.co.nmsworks.week1.day2;

public class AlphaPattern
{
    public static void main(String[] args)
    {
        int row = 5;
        patternAlpha(row);
    }
   public static void patternAlpha(int row){
       int ascii = 65;
        for(int i = 1 ; i < row+1 ;i++)
        {
            for(int j = i ; j< i+1 ; j++)
            {
                System.out.println((char)ascii);
                ascii++;
            }
        }
   }
}

