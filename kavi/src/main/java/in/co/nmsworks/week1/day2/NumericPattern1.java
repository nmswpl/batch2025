package in.co.nmsworks.week1.day2;
//6.Numeric Pattern 1 :
public class NumericPattern1 {

        public static void printPattern(int n)
        {
            int i, j;
            for (i = 1; i <= n; i++) {
                for (j = 1; j <= i; j++) {
                    System.out.print(j + " ");
                }
                System.out.println();
            }
        }

        public static void main(String args[])
        {
            int n = 7;
            printPattern(n);
        }
    }