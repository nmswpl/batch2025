package in.co.nmsworks.week2.day4;

public class Calculator {
    public static void main(String[] args) {
        Adder adder=new Adder();
        Multiplier multiplier=new Multiplier();
        Divider divider=new Divider();

        System.out.println(performCalculation(12,23,adder));
        System.out.println(performCalculation(6,5,multiplier));
        System.out.println(performCalculation(45,9,divider));

    }

    public static int performCalculation(int a, int b, Computable computable){
        return computable.compute(a,b);
    }
}
