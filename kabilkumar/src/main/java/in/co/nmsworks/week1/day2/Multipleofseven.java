package in.co.nmsworks.week1.day2;

public class Multipleofseven
{
    public  static void main(String[] args)
    {
       multiplication(1,7);
    }
    public  static void  multiplication(int a,int b)
    {  for (int i = 1; i <= 10; i++) {
        int c = i * b;
        System.out.println(i + "*" + b + "=" + c);
    }
    }
}
