package in.co.nmsworks.week1.day2.pattern;

//Star Pattern 1 :
//        *
//        * *
//        * * *
//        * * * *
//        * * * * *
//        * * * * * *
//        * * * * * * *
public class StarPattern1 {
        public static void main(String[] args)
        {
            new StarPattern1().pattern(7);
        }
        public void pattern(int n)
        {
            for(int i=1;i<=n;i++)
            {
                for(int j=1;j<=i;j++)
                {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
    }


