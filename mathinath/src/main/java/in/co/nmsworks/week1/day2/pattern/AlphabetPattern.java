package in.co.nmsworks.week1.day2.pattern;

//Alphabet Pattern 1 :
//A
//B B
//C C C
//D D D D
//E E E E E
//F F F F F F
//G G G G G G G

public class AlphabetPattern {
    public static void main(String[] args)
    {
        int n=7;
        for(int i=1;i<=7;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print((char)(i+64)+" ");
            }
            System.out.println();
        }
    }


}
