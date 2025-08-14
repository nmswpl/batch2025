package in.co.nmsworks.week2.day4;

public class Calculator {
    public static void main(String[] args) {
        Computable adder=new Add();
        adder.compute(12,10);
        performcal(adder);

        Computable multiply=new Multiplier();
        multiply.compute(12,2);
        performcal(multiply);


        Computable divide=new Divider();
        divide.compute(10,5);
        performcal(divide);

    }
    public static void performcal(Computable computable){
        System.out.println("*******");

    }
}
