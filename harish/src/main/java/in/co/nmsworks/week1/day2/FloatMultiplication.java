/*Write a program to Multiply Two Floating-Point Numbers
The Result is: 3.0
*/
package in.co.nmsworks.week1.day2;

public class FloatMultiplication {
    public static void main(String[] args) {
        float number1 = 3.0f, number2 = 1.0f;
        multiplication(number1,number2);
    }
    public static void multiplication(float number1,float number2){
        float multiplicationOfTwoNumbers;
        multiplicationOfTwoNumbers = number1 * number2;
        System.out.println("The Multiplication two float number is "+multiplicationOfTwoNumbers);
    }
}
