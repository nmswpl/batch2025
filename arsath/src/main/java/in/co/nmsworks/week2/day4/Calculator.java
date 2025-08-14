package in.co.nmsworks.week2.day4;

import com.mysql.cj.xdevapi.JsonParser;

public class Calculator {
    public static void main(String[] args) {

        Computable addition = new Adder();
        Computable multipication = new Multiplier();
        Computable division = new Divider();

        performCalculation(2,3,addition);
        performCalculation(44,4,division);
        performCalculation(11,0,division);
        performCalculation(6,7,multipication);


    }

    public static void performCalculation(int a,int b,Computable c){
        if(c instanceof Adder){
            System.out.println("Addition of " + a + " and " + b + " = " + c.compute(a,b));
        }

        else if(c instanceof Divider){
            System.out.println("Division of " + a + " by " + b + " = " + c.compute(a,b));
        }

        else if(c instanceof Multiplier){
            System.out.println("Multiplication of " + a + " and " + b + " = " + c.compute(a,b));
        }
    }
}
