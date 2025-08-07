package in.co.nmsworks.week1.day2;
//5) Factorial Write a program to Find Largest Among Three numbers using
//if..else statement
public class LargestThreeNumber {
        static int LargeThree(int x, int y, int z)
        {
            if (x >= y && x >= z)
                return x;
            else if (y >= z)
                return y;

            else
                return z;
        }
        public static void main(String[] args)
        {
            int a, b, c, largest;
            a = 2;
            b = 3;
            c = 5;
            largest = LargeThree(a, b, c);
            System.out.println(largest
                    + " is the largest number.");
        }
}

