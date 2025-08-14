package in.co.nmsworks.week2.day4;

public class Calculator
{
    public static void main(String[] args) {



        Adder add = new Adder();
        Multipiler mul = new Multipiler();
        Divider div = new Divider();

        performCalculation(3,4,add);
        performCalculation(3,4,mul);
        performCalculation(10,2,div);
    }

    public static void performCalculation(int a , int b,Computable opertor)
    {

        System.out.println(opertor.compute(a,b));
    }
}
