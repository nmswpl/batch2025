package in.co.nmsworks.week1.day2;

/*A
B B
C C C
D D D D
E E E E E
F F F F F F
G G G G G G G

 */
public class Alphabet
{
    public static void main(String[] args)
    {
        int n=75;
        for (int i=65; i<n; i++)
            {
                for (int j=64; j<i; j++)
                {
                    System.out.print((char)i);
                }
                System.out.println();
            }
        }
    }


