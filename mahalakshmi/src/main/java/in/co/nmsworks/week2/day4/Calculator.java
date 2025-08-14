package in.co.nmsworks.week2.day4;

public class Calculator {
    public static void performCalculation(int a, int b, Computable operation) {
        System.out.println(operation.compute(a,b));
    }

    public static void main(String[] args) {
        Computable add = new Adder();
        performCalculation(4,8,add);

        Computable mul = new Multiplier();
        performCalculation(9,5,mul);

        Computable div1 =new Divider();
        performCalculation(8,0,div1);

        Computable div2 =new Divider();
        performCalculation(8,4, div2);
    }
}
