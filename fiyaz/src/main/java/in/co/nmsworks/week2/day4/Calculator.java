package in.co.nmsworks.week2.day4;

public class Calculator {

    public static void main(String[] args) {
        Adder a = new Adder();
        performCalculator(2,4,a);

        Multiplier m = new Multiplier();
        performCalculator(2,4,m);

        Divider d = new Divider();
        performCalculator(10,10,d);
        performCalculator(10,0,d);
    }


    public static void performCalculator(int a, int b, Computable operation) {
        System.out.println("Result : " + operation.compute(a,b));
    }
}
