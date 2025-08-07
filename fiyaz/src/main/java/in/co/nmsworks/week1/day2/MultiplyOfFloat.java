package in.co.nmsworks.week1.day2;

//2) Write a program to Multiply Two Floating-Point Numbers
//The Result is: 3.0

public class MultiplyOfFloat {
    public static void main(String[] args) {

        double num1 = 1.0;
        double num2 = 3.0;
        multiplyOffloat(num1, num2);
    }

    public static void multiplyOffloat(double n1, double n2) {
        System.out.println("The Result is: " + (n1*n2));
    }

}