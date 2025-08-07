package in.co.nmsworks.week1.day2;
public class Multiply {

    // 2) Write a program to Multiply Two Floating-Point Numbers
    public static void main(String[] args) {
        float a = 5.0f;
        float b = 10.5f;
        float c = 3.0f, d = 1.0f;
        System.out.println("The Result is: " + multiplyNum(a,b));
        System.out.println("The Result is: " + multiplyNum(c,d));
    }

    public static float multiplyNum(float n1, float n2) {
        return n1*n2;
    }
}
