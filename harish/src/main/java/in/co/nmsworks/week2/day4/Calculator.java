package in.co.nmsworks.week2.day4;

public class Calculator {
    public static void main(String[] args) {

        Adder add = new Adder();
        Multiplier multi = new Multiplier();
        Divisions div = new Divisions();
        performCalculations(5,6,add);
        performCalculations(6,5,multi);
        performCalculations(10,6,div);
    }

    public static void performCalculations(int num1, int num2,Computable d) {
        if (d instanceof Divisions){
            if ( num2 == 0){
                System.out.println("This is not divisible because the divider is zero");
            }
            else{
                System.out.print(d.compute(num1,num2));
                System.out.print("\n");
            }
        }
        else{
            System.out.print(d.compute(num1,num2));
            System.out.println("\n");
        }

    }
}
