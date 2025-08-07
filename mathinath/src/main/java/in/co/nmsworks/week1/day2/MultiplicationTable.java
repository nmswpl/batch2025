package in.co.nmsworks.week1.day2;
//Multiples of 7 Program in Java
//7 x 1 =7
//        7 x 2 = 14
//        7 x 3 = 21
//        …
//        ...
//        7 x 10 = 70
public class MultiplicationTable {
    public static void main(String[] args)
    {
        new MultiplicationTable().printMultiplicationTable(7);
    }
    public void printMultiplicationTable(int a)
    {
        for(int i=1;i<=10;i++)
        {
            System.out.println(a+" x "+i+" = "+a*i);
        }
    }
}

