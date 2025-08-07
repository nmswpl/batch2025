package in.co.nmsworks.week1.day2;

public class Factorial {
    public static void main(String[] args)
    {
        int a = 5;
        fact(5);

    }
    public static void fact( int a)
        { int temp = 1;
            for (int i = 1; i <= 5; i++) {

                temp = temp * i;
                int res = temp;

                System.out.println(res);
            }
        }

}
