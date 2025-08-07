package in.co.nmsworks.week1.day2;
//7.Numeric Pattern 2
public class NumericPattern2 {

        public static void printPattern(int n)
        {
            int i, j;

            for (i = n; i >= 1; i--) {
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

