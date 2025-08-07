package in.co.nmsworks.week1.day2;

/**
 * Write a program to Multiply Two Floating-Point Numbers
 * The Result is: 3.0
 **/
public class MultipleFloatingPoints {
    static float multiplyOfTwoNumber(float value , float multiplier){
        //System.out.println("The Result is "+ value*multiplier);
        return value*multiplier;
    }

    public static void main(String[] args) {
        System.out.println("The Result is : "+multiplyOfTwoNumber(3.0f,1.0f));

    }
}
