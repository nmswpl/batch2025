/*Write a program to Multiply Two Floating-Point Numbers
The Result is: 3.0
*/
package in.co.nmsworks.week1.day2;

public class FloatMultiplication {
    public static void main(String[] args) {
        float number1 = 3.0f, number2 = 1.0f;
        mUltiplication(number1,number2);
    }
    public static void mUltiplication(float number1,float number2){
        float MultiplicationOfTwoNumbers;
        MultiplicationOfTwoNumbers = number1 * number2;
        System.out.println("The Multiplication two float number is "+MultiplicationOfTwoNumbers);
    }
}
