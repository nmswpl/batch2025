package in.co.nmsworks.week2.day4;

public class Calculator {
    public static void main(String[] args) {
        Adder adder = new Adder();

        Multiplier multiplier = new Multiplier();

        Divider divider = new Divider();

        printCalculation(4, 3, adder);

        printCalculation(5,4, multiplier);

        printCalculation(10,2, divider);


    }

    public static void printCalculation(int a, int b, Computable object){
        System.out.println(object.compute(a, b));
    }
}
