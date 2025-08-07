package in.co.nmsworks.week1.day2;

public class LargestOfThree {

    public static void main(String[] args)
    {
        int num1=22,num2=22,num3=22;
        int high = LargestOfThree.biggestNumber(num1,num2,num3);
        if(high==0)
            System.out.println("Given numbers are equal");
        else
            System.out.println(high);

    }
    public static int biggestNumber(int num1,int num2,int num3)
    {
        int bigNum;
        if(num1==num2 && num2==num3)
            return 0;
        else {
            if (num1 > num2 && num1 > num3) {
                bigNum = num1;
            } else if (num2 > num3 && num2 > num1) {
                bigNum = num2;
            } else {
                bigNum = num3;
            }
        }
        return bigNum;

    }
}
