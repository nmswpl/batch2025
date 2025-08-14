package in.co.nmsworks.week.day4;

public class Calculator {
    public void performCalculation(int a, int b, Computable operation) {
        int result = operation.compute(a, b);
        System.out.println("Result: " + result);
    }
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        Computable adder = new Adder();
        Computable multiplier = new Multiplier();
        Computable diveder = new Diveder();

        System.out.println("Addition:");
        calculator.performCalculation(10, 5, adder);

        System.out.println("Multiplication:");
        calculator.performCalculation(10, 5, multiplier);

        System.out.println("\nDivision (by zero):");
        calculator.performCalculation(10, 0, diveder);

        System.out.println("\nDivision (valid):");
        calculator.performCalculation(10, 2, diveder);
    }

}
