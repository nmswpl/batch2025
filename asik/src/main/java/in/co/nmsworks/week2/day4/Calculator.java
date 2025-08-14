package in.co.nmsworks.week2.day4;

public class Calculator
{
    public static void main(String[] args)
    {
        Adder add = new Adder();
        Multiplier mul = new Multiplier();
        Divider div = new Divider();

        System.out.println(performCalculation(5, 5, add));
        System.out.println(performCalculation(10, 5, mul));
        int d = performCalculation(-1, 1, div);
        System.out.println(div.errorCode == 1 ? "Division Error" : d);
    }

    public static int performCalculation(int a, int b, Computable operation)
    {
        return operation.compute(a, b);
    }
}
