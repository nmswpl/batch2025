package in.co.nmsworks.week1.day2;

// 2,Write a program to Multiply Two Floating-Point Numbers
//The Result is: 3.0

public class Multiply_Float_Numbers {

    public static float multiplyFloat(float mul1, float mul2){
        return mul1 * mul2;
    }

    public static void main(String[] args) {
        float mul1 = 3.3F;
        float mul2 = 6.6F;
        System.out.println("Answer of float value :" + multiplyFloat(mul1,mul2));
    }

}
