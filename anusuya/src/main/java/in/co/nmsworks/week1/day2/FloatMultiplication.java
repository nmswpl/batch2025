package in.co.nmsworks.week1.day2;

/* Write a program to Multiply Two Floating-Point Numbers
The Result is: 3.0
 */

public class FloatMultiplication {

    static void printMultiplyFloat (float num1, float num2){
        float result = num1 * num2;
        System.out.println("The Result is : " + result );
    }

    public static void main(String[] args) {
        float num1 = 1.0f;
        float num2 = 3.0f;

        printMultiplyFloat(num1, num2);
    }
}
