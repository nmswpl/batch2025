package in.co.nmsworks.week1.day2;

public class Floatmultiply
{
    public static void main(String[] args)
    {
        float num1=7.0f;
        float num2=7.0f;
        float sum= Floatmultiply.multiplyFloat(num1,num2);
        System.out.println(sum);
    }

    public static float multiplyFloat(float num1,float num2)
    {
        float sum;
        sum=num1*num2;
        return sum;
    }
}

