package in.co.nmsworks.week2.day4;

public class Calculator {
    public static void main(String[] args) {
        Adder add = new Adder();
        Calculator.performCalculation(5 , 4 , add);


        Multiplier mul = new Multiplier();
        Calculator.performCalculation(3 , 4 , mul);


        Divider div = new Divider();
        Calculator.performCalculation(10 , 5, div);


    }
    public static void performCalculation(int a , int b ,Computable c){
        System.out.println(c.compute(a, b));
    }
}
