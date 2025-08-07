package in.co.nmsworks.week1.day2;

//3) Multiples of 7 Program in Java
public class MulitplicationTable
{

    public static void main(String[] args)
    {
        int n = 9;
        multiplicationTable(n);
    }

    public static void multiplicationTable(int n)
    {
        for(int i = 1; i <= 10; i++)
        {
            System.out.println(n + " x " + i + " = " + n*i);

        }
    }
}
