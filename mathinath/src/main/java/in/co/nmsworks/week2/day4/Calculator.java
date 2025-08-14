package in.co.nmsworks.week2.day4;

public class Calculator {
    public static void main(String[] args) {
        Adder a=new Adder();
        performCalculation(2,3,a);

        Multiplier m=new Multiplier();
        performCalculation(2,4,m);

        Divider d=new Divider();
        performCalculation(4,2,d);


    }
    public static void performCalculation(int a, int b, Computable operation)
    {
        System.out.println("Operation "+operation.compute(a,b));
    }
}
