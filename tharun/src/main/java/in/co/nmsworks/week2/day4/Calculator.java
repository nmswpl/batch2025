package in.co.nmsworks.week2.day4;

public class Calculator{

    public void performCalculation(int a , int b, Computable calculate){

        if (calculate instanceof Adder){
            Adder addition = (Adder) calculate;
            System.out.println("Addition of Two Numbers : " + addition.compute(a,b));
        }
        else if (calculate instanceof  Multiplier) {
            Multiplier multiplication = (Multiplier) calculate;
            System.out.println("Multiple of Two Numbers : " + multiplication.compute(a,b));
        }
        else {
            Divider divide = (Divider) calculate;
            System.out.println("Division  : " + divide.compute(a,b));
        }
    }

}
