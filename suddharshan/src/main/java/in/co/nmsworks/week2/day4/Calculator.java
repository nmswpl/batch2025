package in.co.nmsworks.week2.day4;

public class Calculator {
    public void performCalculation(int a, int b, Computable c){
        System.out.println(c.getClass().getSimpleName() + " output is: " + c.compute(a,b));
    }

    public static void main(String[] args) {
        Adder a = new Adder();
        Multiplier m = new Multiplier();
        Divider d = new Divider();

        Calculator c = new Calculator();

        c.performCalculation(2,3,a);
        c.performCalculation(6,8,m);
        c.performCalculation(10,2,d);
        c.performCalculation(10,0,d);
    }
}
