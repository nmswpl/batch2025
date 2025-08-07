package in.co.nmsworks.week1.day2;
//2) Write a program to Multiply Two Floating-Point Numbers
//The Result is: 3.0

public class MultiplyfloatingPoint {
    public static void main(String[] args)
    {
        new MultiplyfloatingPoint().multiply(1.0f,2.0f);
    }
    public void multiply(float a,float b)
    {
       float mul = a * b;
       System.out.println("Multiply Two Floating-Point Numbers are :"+mul);
    }
}
