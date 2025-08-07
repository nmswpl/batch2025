package in.co.nmsworks.week1.day2.basicprograms;
/*
Write a program to Multiply Two Floating-Point Numbers
The Result is: 3.0
 */
public class MultiplyOfFloat {
    public static void main(String[] args) {
        float a = 5.4f;
        float b= 7.7f;
        System.out.println("The Result is: " + getMultiply(a,b));
        float u = 4.4f;
        float v= 5.7f;
        System.out.println("The Result is: " + getMultiply(u,v));
    }
    public static float getMultiply(float a, float b){
        float res = a * b;
        return res;
    }
}


