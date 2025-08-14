package in.co.nmsworks.week2.day4;

public class Calculator {

    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        Adder add = new Adder();
        calculator.performCalculation(5, 10, add);

        Multiplier multiple = new Multiplier();
        calculator.performCalculation(15, 10, multiple);

        Divider divide = new Divider();
        calculator.performCalculation(10, 2, divide);
    }

    public void performCalculation(int a, int b, Computable operation){
        System.out.println(operation.compute(a,b));
    }

}