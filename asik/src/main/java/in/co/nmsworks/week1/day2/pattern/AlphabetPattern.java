package in.co.nmsworks.week1.day2.pattern;

/*
    A
    B B
    C C C
    D D D D
    E E E E E
    F F F F F F
    G G G G G G G
*/
public class AlphabetPattern
{
    public static void main(String[] args) {
        int ascii = 65;
        int n = 7;
        printAlphabetPattern(ascii, n);
    }

    public static void printAlphabetPattern(int ascii, int n)
    {
        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j <= i; j++)
            {
                System.out.print(" " + (char)ascii + " ");
            }
            ascii++;
            System.out.println();
        }
    }
}
